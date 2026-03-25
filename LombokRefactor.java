import java.io.IOException;
import java.nio.file.*;
import java.util.regex.*;

public class LombokRefactor {
    public static void main(String[] args) throws IOException {
        String baseDir = "src/main/java/com/cts/regreportx";
        String[] folders = {"model", "dto"};

        for (String folder : folders) {
            Path dirPath = Paths.get(baseDir, folder);
            if (!Files.exists(dirPath)) continue;

            Files.walk(dirPath)
                 .filter(Files::isRegularFile)
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(p -> {
                     try {
                         processFile(p);
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 });
        }
        System.out.println("Done refactoring Lombok.");
    }

    private static void processFile(Path filepath) throws IOException {
        String content = Files.readString(filepath);
        String originalContent = content;

        // 1. Add headers
        if (!content.contains("lombok.Data")) {
            content = content.replaceFirst("(package\\s+com\\.cts\\.regreportx\\.[a-z0-9_]+;\\s*)", 
                                          "$1\nimport lombok.Data;\nimport lombok.NoArgsConstructor;\n");
        }

        // 2. Add annotations
        if (!content.contains("@Data")) {
            content = content.replaceFirst("(public\\s+(?:abstract\\s+)?class\\s+\\w+)", 
                                          "@Data\n@NoArgsConstructor\n$1");
        }

        // 3. Find and remove getters and setters
        // Match: optional spaces + public + return type + getter/setter name + parameters + simple brace body
        Pattern pattern = Pattern.compile("^[ \\t]*public\\s+[\\w<>\\.,\\[\\]\\s]+\\s+(get|set|is)[A-Z]\\w*\\s*\\([^)]*\\)\\s*\\{[^{}]*\\}[\\r\\n]*", Pattern.MULTILINE);
        
        while (true) {
            Matcher matcher = pattern.matcher(content);
            String newContent = matcher.replaceAll("");
            if (newContent.equals(content)) {
                break;
            }
            content = newContent;
        }

        // 4. Find and remove empty constructors
        Pattern constructorPattern = Pattern.compile("^[ \\t]*public\\s+\\w+\\s*\\(\\s*\\)\\s*\\{\\s*\\}[\\r\\n]*", Pattern.MULTILINE);
        while (true) {
            Matcher matcher = constructorPattern.matcher(content);
            String newContent = matcher.replaceAll("");
            if (newContent.equals(content)) {
                break;
            }
            content = newContent;
        }

        // Strip empty lines left behind at the end of the class
        content = content.replaceAll("[\\r\\n]+}", "\n}");

        if (!content.equals(originalContent)) {
            Files.writeString(filepath, content);
            System.out.println("Refactored: " + filepath);
        }
    }
}
