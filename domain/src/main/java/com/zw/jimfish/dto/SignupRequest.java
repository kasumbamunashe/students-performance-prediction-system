package com.zw.jimfish.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SignupRequest {
    @JsonIgnore
    private Long id;

    private String name;
    private String email;
    private String password;
}
