package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class RawRecordDto {

    private Integer rawRecordId;

    private Integer batchId;

    private String payloadJson;

    private LocalDateTime recordDate;
}
