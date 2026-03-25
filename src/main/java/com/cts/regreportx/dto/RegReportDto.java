package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RegReportDto {

    private Integer reportId;

    private Integer templateId;

    private String period;

    private LocalDateTime generatedDate;

    private String status;
}
