package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.AudienciaExt;
import com.TallerAudiencias.audiencias.repositories.AudienciaExtRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AudienciaExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudienciaExtServiceImp implements AudienciaExtService {
    @Autowired
    private AudienciaExtRepository audienciaExtRepository;

    @Override
    public AudienciaExt createAudienciaExt(AudienciaExt audienciaExt) {
        return null;
    }

    @Override
    public AudienciaExt updateAudienciaExt(AudienciaExt audienciaExt) {
        return null;
    }

    @Override
    public void deleteAudienciaExt(Long id) {

    }

    @Override
    public AudienciaExt getAudienciaExtById(Long id) {
        return null;
    }

    @Override
    public List<AudienciaExt> getAudienciaExtByAudienciaId(Long audienciaId) {
        return List.of();
    }
}
