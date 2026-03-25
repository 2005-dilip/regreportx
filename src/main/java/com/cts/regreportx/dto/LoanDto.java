package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class LoanDto {

    private String loanId;

    private Integer customerId;

    private String branchId;

    private String loanType;

    private BigDecimal loanAmount;

    private BigDecimal interestRate;

    private String currency;

    private LocalDate startDate;

    private LocalDate maturityDate;

    private String status;
}
