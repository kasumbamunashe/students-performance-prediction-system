package com.zw.jimfish;




import com.zw.jimfish.enums.UserRole;
import com.zw.jimfish.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);

    Optional<User> findFirstByEmail(String username);

    Optional<User> findByUserRole(UserRole userRole);
}
