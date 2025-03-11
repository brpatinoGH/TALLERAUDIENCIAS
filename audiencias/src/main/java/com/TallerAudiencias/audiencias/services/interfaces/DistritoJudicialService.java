package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;

import java.util.List;

public interface DistritoJudicialService {
    DistritoJudicial createDistrito(DistritoJudicial distrito);
    DistritoJudicial updateDistrito(DistritoJudicial distrito);
    void deleteDistrito(Long id);
    DistritoJudicial getDistritoById(Long id);
    List<DistritoJudicial> getAllDistritos();
    DistritoJudicial findByNombre(String nombre);
}
