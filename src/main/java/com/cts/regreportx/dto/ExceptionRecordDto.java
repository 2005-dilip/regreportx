package com.cts.regreportx.dto;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ExceptionRecordDto {

    private Integer exceptionId;

    private Integer reportId;

    private Integer fieldId;

    private String issue;

    private String severity;

    private Integer assignedTo;

    private String status;
}
