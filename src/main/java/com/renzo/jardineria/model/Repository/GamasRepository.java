package com.renzo.jardineria.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renzo.jardineria.model.Entity.Gamas;

@Repository
public interface GamasRepository extends JpaRepository<Gamas,String> {
    
}
