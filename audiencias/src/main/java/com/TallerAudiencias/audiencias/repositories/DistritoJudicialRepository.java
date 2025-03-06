package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistritoJudicialRepository extends JpaRepository<DistritoJudicial, Long> {

    @Override
    Optional<DistritoJudicial> findById(Long distritoJudicialId);

}
