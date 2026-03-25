package com.cts.regreportx.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ExposureRecord")
@Data
@NoArgsConstructor
public class ExposureRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExposureID")
    private Integer exposureId;

    @ManyToOne
    @JoinColumn(name = "ReportID")
    private RegReport report;

    @Column(name = "CounterpartyID")
    private String counterpartyId;

    @Column(name = "EAD")
    private BigDecimal ead;

    @Column(name = "LGD")
    private BigDecimal lgd;

    @Column(name = "PD")
    private BigDecimal pd;

    @Column(name = "RiskWeight")
    private BigDecimal riskWeight;

    @Column(name = "ExposureDate")
    private LocalDate exposureDate;
}
