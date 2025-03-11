package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.AudienciaExt;

import java.util.List;

public interface AudienciaExtService {
    AudienciaExt createAudienciaExt(AudienciaExt audienciaExt);
    AudienciaExt updateAudienciaExt(AudienciaExt audienciaExt);
    void deleteAudienciaExt(Long id);
    AudienciaExt getAudienciaExtById(Long id);
    List<AudienciaExt> getAudienciaExtByAudienciaId(Long audienciaId);
}
