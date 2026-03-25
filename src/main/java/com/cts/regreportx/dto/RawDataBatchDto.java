package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RawDataBatchDto {

    private Integer batchId;

    private Integer sourceId;

    private LocalDateTime ingestedDate;

    private Integer rowCount;

    private String status;
}
