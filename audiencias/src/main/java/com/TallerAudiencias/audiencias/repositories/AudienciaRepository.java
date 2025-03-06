package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AudienciaRepository extends JpaRepository<Audiencia, Long> {

    @Override
    Optional<Audiencia> findById(Long audienciaId);

}
