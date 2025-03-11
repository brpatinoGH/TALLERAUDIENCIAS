package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.AutoridadRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AutoridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoridadServiceImp implements AutoridadService {
    @Autowired
    private AutoridadRepository autoridadRepository;
}
