package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FilingWorkflowDto {

    private Integer workflowId;

    private Integer reportId;

    private String stepName;

    private Integer actorId;

    private LocalDateTime stepDate;

    private String status;
}
