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
@Table(name = "general_ledger")
@Data
@NoArgsConstructor
public class GeneralLedger {

    @Id
    @Column(name = "\"GLID\"")
    private String glId;

    @Column(name = "\"AccountNumber\"")
    private Long accountNumber;

    @Column(name = "\"BranchID\"")
    private String branchId;

    @Column(name = "\"AccountType\"")
    private String accountType;

    @Column(name = "\"Debit\"")
    private BigDecimal debit;

    @Column(name = "\"Credit\"")
    private BigDecimal credit;

    @Column(name = "\"Currency\"")
    private String currency;

    @Column(name = "\"TransactionDate\"")
    private LocalDate transactionDate;
}
