package com.zw.jimfish.employee;


import com.zw.jimfish.dto.UserDto;
import com.zw.jimfish.user.User;

import java.util.List;

public interface EmployeeService {
    List<User> getAllUsers();

    User getUserById(Long id);
    User createUser(UserDto user);
    User updateUser(Long id, UserDto userDetails);
    void deleteUser(Long id);
}
