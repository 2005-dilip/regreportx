package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class NotificationDto {

    private Integer notificationId;

    private Integer userId;

    private String message;

    private String category;

    private String status;

    private LocalDateTime createdDate;
}
