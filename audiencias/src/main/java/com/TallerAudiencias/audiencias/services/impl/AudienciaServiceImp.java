package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.AudienciaRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AudienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudienciaServiceImp implements AudienciaService {
    @Autowired
    private AudienciaRepository audienciaRepository;
}
