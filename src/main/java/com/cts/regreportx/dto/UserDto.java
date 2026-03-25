package com.cts.regreportx.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String name;

    private String username;

    private String email;

    private String password;

    private String role;

    private String status;

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }

    // Getters
    // Setters
}
