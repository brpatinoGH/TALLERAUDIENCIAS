package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Autoridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoridadRepository extends JpaRepository<Autoridad, Long> {
}
