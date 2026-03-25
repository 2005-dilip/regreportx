package com.cts.regreportx.dto;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class RegTemplateDto {

    private Integer templateId;

    private String regulationCode;

    private String description;

    private String frequency;

    private String status;
}
