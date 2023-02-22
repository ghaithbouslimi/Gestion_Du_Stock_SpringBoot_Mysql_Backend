package com.example.backend.Repository;

import com.example.backend.Entity.UsPicklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepUSPicklists extends JpaRepository<UsPicklist , Long> {
}
