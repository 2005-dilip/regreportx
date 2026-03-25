package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TreasuryTradeDto {

    private String tradeId;

    private String instrument;

    private String counterparty;

    private BigDecimal notional;

    private String currency;

    private LocalDate tradeDate;

    private LocalDate maturityDate;
}
