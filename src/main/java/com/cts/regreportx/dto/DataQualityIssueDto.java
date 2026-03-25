package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class DataQualityIssueDto {

    private Integer issueId;

    private Integer batchId;

    private Integer ruleId;

    private String recordId;

    private String message;

    private String severity;

    private LocalDateTime loggedDate;

    private String status;
}
