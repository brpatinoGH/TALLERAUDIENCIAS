package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoJudicialRepository extends JpaRepository<DistritoJudicial, Long> {
}
