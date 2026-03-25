package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CorrectionLogDto {

    private Integer correctionId;

    private Integer exceptionId;

    private String oldValue;

    private String newValue;

    private Integer correctedBy;

    private LocalDateTime correctedDate;
}
