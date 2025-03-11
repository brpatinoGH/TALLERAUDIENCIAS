package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.Autoridad;
import com.TallerAudiencias.audiencias.repositories.AutoridadRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AutoridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoridadServiceImp implements AutoridadService {
    @Autowired
    private AutoridadRepository autoridadRepository;

    @Override
    public Autoridad createAutoridad(Autoridad autoridad) {
        return null;
    }

    @Override
    public Autoridad updateAutoridad(Autoridad autoridad) {
        return null;
    }

    @Override
    public void deleteAutoridad(Long id) {

    }

    @Override
    public Autoridad getAutoridadById(Long id) {
        return null;
    }

    @Override
    public List<Autoridad> getAllAutoridades() {
        return List.of();
    }

    @Override
    public List<Autoridad> getAutoridadesByDistrito(Long distritoId) {
        return List.of();
    }

    @Override
    public List<Autoridad> getAutoridadesByTipo(String tipo) {
        return List.of();
    }

    @Override
    public boolean hasActiveAudiencias(Long autoridadId) {
        return false;
    }
}
