package com.cts.regreportx.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ReportVersion")
@Data
@NoArgsConstructor
public class ReportVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VersionID")
    private Integer versionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ReportID")
    private RegReport report;

    @Column(name = "VersionNumber")
    private Integer versionNumber;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "Status")
    private String status;
}
