package com.zw.jimfish.auth;


import com.zw.jimfish.dto.SignupRequest;
import com.zw.jimfish.dto.UserDto;

public interface AuthService {
    UserDto signupUser(SignupRequest signupRequest);
    boolean hasUserWithEmail(String email);
}
