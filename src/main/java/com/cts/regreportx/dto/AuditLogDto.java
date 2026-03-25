package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AuditLogDto {

    private Integer auditId;

    private Integer userId;

    private String action;

    private String resource;

    private LocalDateTime timestamp;

    private String metadata;
}
