package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

    @Override
    Optional<Sala> findById(Long salaId);

}
