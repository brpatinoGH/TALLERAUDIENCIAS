package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.AudienciaExtRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AudienciaExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudienciaExtServiceImp implements AudienciaExtService {
    @Autowired
    private AudienciaExtRepository audienciaExtRepository;
}
