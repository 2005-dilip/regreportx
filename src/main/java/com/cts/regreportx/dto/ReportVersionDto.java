package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ReportVersionDto {

    private Integer versionId;

    private Integer reportId;

    private Integer versionNumber;

    private LocalDateTime createdDate;

    private String status;
}
