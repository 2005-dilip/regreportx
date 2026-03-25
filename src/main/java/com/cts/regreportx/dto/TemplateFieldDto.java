package com.cts.regreportx.dto;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class TemplateFieldDto {

    private Integer fieldId;

    private Integer templateId;

    private String fieldName;

    private String dataType;

    private String mappingExpression;

    private Boolean requiredFlag;
}
