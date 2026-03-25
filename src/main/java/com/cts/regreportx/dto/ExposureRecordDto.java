package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ExposureRecordDto {

    private Integer exposureId;

    private Integer reportId;

    private String counterpartyId;

    private BigDecimal ead;

    private BigDecimal lgd;

    private BigDecimal pd;

    private BigDecimal riskWeight;

    private LocalDate exposureDate;
}
