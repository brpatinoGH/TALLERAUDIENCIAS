package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.SalaRepository;
import com.TallerAudiencias.audiencias.services.interfaces.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServiceImp implements SalaService {
    @Autowired
    private SalaRepository salaRepository;
}
