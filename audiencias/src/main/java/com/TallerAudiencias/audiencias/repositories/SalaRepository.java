package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}
