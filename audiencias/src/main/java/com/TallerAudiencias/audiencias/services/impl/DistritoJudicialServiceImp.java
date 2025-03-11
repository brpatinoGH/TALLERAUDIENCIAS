package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.DistritoJudicialRepository;
import com.TallerAudiencias.audiencias.services.interfaces.DistritoJudicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistritoJudicialServiceImp implements DistritoJudicialService {
    @Autowired
    private DistritoJudicialRepository distritoJudicialRepository;
}
