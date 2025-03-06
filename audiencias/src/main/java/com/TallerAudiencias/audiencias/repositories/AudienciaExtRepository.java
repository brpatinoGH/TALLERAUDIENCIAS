package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.AudienciaExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AudienciaExtRepository extends JpaRepository<AudienciaExt, Long> {

    @Override
    Optional<AudienciaExt> findById(Long audienciaExtId);
}
