package com.backend.portfolio.repository;

import com.backend.portfolio.models.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyectos, Long> {
    
}
