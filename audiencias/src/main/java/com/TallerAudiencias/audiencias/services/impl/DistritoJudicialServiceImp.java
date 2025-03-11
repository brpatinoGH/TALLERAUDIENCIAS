package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import com.TallerAudiencias.audiencias.repositories.DistritoJudicialRepository;
import com.TallerAudiencias.audiencias.services.interfaces.DistritoJudicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoJudicialServiceImp implements DistritoJudicialService {
    @Autowired
    private DistritoJudicialRepository distritoJudicialRepository;

    @Override
    public DistritoJudicial createDistrito(DistritoJudicial distrito) {
        return null;
    }

    @Override
    public DistritoJudicial updateDistrito(DistritoJudicial distrito) {
        return null;
    }

    @Override
    public void deleteDistrito(Long id) {

    }

    @Override
    public DistritoJudicial getDistritoById(Long id) {
        return null;
    }

    @Override
    public List<DistritoJudicial> getAllDistritos() {
        return List.of();
    }

    @Override
    public DistritoJudicial findByNombre(String nombre) {
        return null;
    }
}
