package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DepositDto {

    private String depositId;

    private Integer customerId;

    private String branchId;

    private String depositType;

    private BigDecimal amount;

    private BigDecimal interestRate;

    private String currency;

    private LocalDate openDate;

    private LocalDate maturityDate;
}
