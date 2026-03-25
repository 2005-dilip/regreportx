package com.cts.regreportx.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "treasury")
@Data
@NoArgsConstructor
public class TreasuryTrade {

    @Id
    @Column(name = "\"TradeID\"")
    private String tradeId;

    @Column(name = "\"Instrument\"")
    private String instrument;

    @Column(name = "\"Counterparty\"")
    private String counterparty;

    @Column(name = "\"Notional\"")
    private BigDecimal notional;

    @Column(name = "\"Currency\"")
    private String currency;

    @Column(name = "\"TradeDate\"")
    private LocalDate tradeDate;

    @Column(name = "\"MaturityDate\"")
    private LocalDate maturityDate;
}
