package com.zw.jimfish.dto;

import com.zw.jimfish.enums.UserRole;
import lombok.Data;


@Data
public class UserDto {
    private Long id;
    private String password;
    private String name;
    private String email;
    private String username;
    private String phoneNumber;
    private String address;
    private String gender;
    private String department;
    private UserRole userRole;
}
