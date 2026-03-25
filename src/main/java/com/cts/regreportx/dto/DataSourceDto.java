package com.cts.regreportx.dto;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DataSourceDto {

    private Integer sourceId;

    private String name;

    private String sourceType;

    private String schedule;

    private String status;
}
