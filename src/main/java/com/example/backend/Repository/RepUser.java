package com.example.backend.Repository;

import com.example.backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepUser extends JpaRepository<User, Long> {
}
