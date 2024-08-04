package com.zw.jimfish.dto;

import com.zw.jimfish.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private long userId;
    private UserRole userRole;
    private boolean success;
    private String message;
}
