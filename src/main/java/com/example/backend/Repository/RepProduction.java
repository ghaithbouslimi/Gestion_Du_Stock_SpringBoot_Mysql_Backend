package com.example.backend.Repository;

import com.example.backend.Entity.LigneProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepProduction extends JpaRepository<LigneProduction , Long> {
}
