package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.entities.Sala;
import com.TallerAudiencias.audiencias.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    private List<Sala> findAll() {
        return salaRepository.findAll();
    }

    private Optional<Sala> findById(Long salaId) {
        return salaRepository.findById(salaId);
    }

    private List<Sala> findBySalNombre(String salNombre) {
        return salaRepository.findBySalNombre(salNombre);
    }

    private List<Sala> findBySalLugar(String salLugar) {
        return salaRepository.findBySalLugar(salLugar);
    }
}
