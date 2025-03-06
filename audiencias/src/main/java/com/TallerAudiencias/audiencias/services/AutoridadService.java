package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.entities.Autoridad;
import com.TallerAudiencias.audiencias.repositories.AutoridadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoridadService {
    @Autowired
    private AutoridadRepository autoridadRepository;

    private List<Autoridad> findAll() {
        return autoridadRepository.findAll();
    }

    private Optional<Autoridad> findById (Long autId) {
        return autoridadRepository.findById(autId);
    }

    private List<Autoridad> findByAutNombre(String autNombre) {
        return autoridadRepository.findByAutNombre(autNombre);
    }

    private  List<Autoridad> findByAutEmail(String autEmail) {
        return autoridadRepository.findByAutEmail(autEmail);
    }
}
