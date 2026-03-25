package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class EvidenceDto {

    private Integer evidenceId;

    private Integer reportId;

    private String fileUri;

    private Integer uploadedBy;

    private LocalDateTime uploadedDate;
}
