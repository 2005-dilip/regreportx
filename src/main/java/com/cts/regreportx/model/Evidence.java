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
import java.time.LocalDateTime;

@Entity
@Table(name = "Evidence")
@Data
@NoArgsConstructor
public class Evidence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EvidenceID")
    private Integer evidenceId;

    @ManyToOne
    @JoinColumn(name = "ReportID")
    private RegReport report;

    @Column(name = "FileURI")
    private String fileUri;

    @Column(name = "UploadedBy")
    private Integer uploadedBy;

    @Column(name = "UploadedDate")
    private LocalDateTime uploadedDate;
}
