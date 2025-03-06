package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.entities.Audiencia;
import com.TallerAudiencias.audiencias.repositories.AudienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AudienciaService {
    @Autowired
    private AudienciaRepository audienciaRepository;

    public Optional<Audiencia> findById(Long audId){
        return AudienciaRepository.findById(audId);
    }

    public List<Audiencia> findByAudNombre(String audNombre){
        return AudienciaRepository.findByAudNombre(audNombre);
    }
    public Optional<Audiencia> findAll(){
        return AudienciaRepository.findAll();
    }


}
