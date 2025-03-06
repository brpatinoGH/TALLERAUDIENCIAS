package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;
}
