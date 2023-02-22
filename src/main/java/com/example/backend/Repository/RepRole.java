package com.example.backend.Repository;

import com.example.backend.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepRole extends JpaRepository<Role, String> {
}
