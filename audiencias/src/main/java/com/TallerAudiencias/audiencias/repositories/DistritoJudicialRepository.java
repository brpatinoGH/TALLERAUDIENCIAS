package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistritoJudicialRepository extends JpaRepository<DistritoJudicial, Long> {

    List<DistritoJudicial> findByDisNombre(String distritoJudicialNombre);

}
