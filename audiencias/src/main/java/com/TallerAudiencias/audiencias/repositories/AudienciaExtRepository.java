package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.AudienciaExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudienciaExtRepository extends JpaRepository<AudienciaExt, Long> {
}
