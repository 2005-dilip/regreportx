package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class GeneralLedgerDto {

    private String glId;

    private Long accountNumber;

    private String branchId;

    private String accountType;

    private BigDecimal debit;

    private BigDecimal credit;

    private String currency;

    private LocalDate transactionDate;
}
