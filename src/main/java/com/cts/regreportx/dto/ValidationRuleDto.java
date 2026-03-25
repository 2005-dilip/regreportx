package com.cts.regreportx.dto;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ValidationRuleDto {

    private Integer ruleId;

    private String name;

    private String ruleExpression;

    private String severity;

    private String status;
}
