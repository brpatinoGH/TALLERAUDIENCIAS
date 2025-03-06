package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import com.TallerAudiencias.audiencias.repositories.DistritoJudicialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoJudicialService {
    @Autowired
    private DistritoJudicialRepository distritoJudicialRepository;

    public Optional<DistritoJudicial> findById(long disId){
        return distritoJudicialRepository.findById(disId);
    }

    public List<DistritoJudicial> findByDisNombree(String disNombre){
        return distritoJudicialRepository.findByDisNombre(disNombre);
    }

    public List<DistritoJudicial> findAll(){
        return distritoJudicialRepository.findAll();
    }
}
