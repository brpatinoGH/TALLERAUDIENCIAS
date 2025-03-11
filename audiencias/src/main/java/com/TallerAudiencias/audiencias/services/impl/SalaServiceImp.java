package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.Sala;
import com.TallerAudiencias.audiencias.repositories.SalaRepository;
import com.TallerAudiencias.audiencias.services.interfaces.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServiceImp implements SalaService {
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public Sala createSala(Sala sala) {
        return null;
    }

    @Override
    public Sala updateSala(Sala sala) {
        return null;
    }

    @Override
    public void deleteSala(Long id) {

    }

    @Override
    public Sala getSalaById(Long id) {
        return null;
    }

    @Override
    public List<Sala> getAllSalas() {
        return List.of();
    }

    @Override
    public List<Sala> getSalasByDistrito(Long distritoId) {
        return List.of();
    }
}
