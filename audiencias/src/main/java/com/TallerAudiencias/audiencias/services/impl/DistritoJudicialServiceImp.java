package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import com.TallerAudiencias.audiencias.repositories.DistritoJudicialRepository;
import com.TallerAudiencias.audiencias.services.interfaces.DistritoJudicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoJudicialServiceImp implements DistritoJudicialService {
    @Autowired
    private DistritoJudicialRepository distritoJudicialRepository;


    @Override
    public Optional<DistritoJudicial> getDistritoById(Long id) {
        try {
            return distritoJudicialRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("No existe un distrito con ese ID", e);
        }
    }

    @Override
    public List<DistritoJudicial> getAllDistritos() {
        try {
            return distritoJudicialRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("No se encuentran los distritos", e);
        }
    }

    @Override
    public Optional<DistritoJudicial> findByNombre(String nombre) {
        try {
            return distritoJudicialRepository.findByDisNombre(nombre);
        } catch (Exception e) {
            throw new RuntimeException("No existe un distrito con ese nombre", e);
        }
    }
}
