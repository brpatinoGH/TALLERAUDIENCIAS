package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;

import java.util.List;
import java.util.Optional;

public interface DistritoJudicialService {
    Optional<DistritoJudicial> getDistritoById(Long id);
    List<DistritoJudicial> getAllDistritos();
    Optional<DistritoJudicial> findByNombre(String nombre);
}
