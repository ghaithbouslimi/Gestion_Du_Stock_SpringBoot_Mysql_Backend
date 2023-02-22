package com.example.backend.Repository;

import com.example.backend.Entity.Picklists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepPicklists extends JpaRepository<Picklists, Long> {
}
