package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.repositories.AudienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudienciaService {
    @Autowired
    private AudienciaRepository audienciaRepository;
}
