package org.example.SoftwareMonitoring.repos;

import org.example.SoftwareMonitoring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
