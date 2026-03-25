package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RiskMetricDto {

    private Integer metricId;

    private Integer reportId;

    private String metricName;

    private BigDecimal metricValue;

    private LocalDateTime calculationDate;
}
