package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.Autoridad;

import java.util.List;

public interface AutoridadService {
    Autoridad createAutoridad(Autoridad autoridad);
    Autoridad updateAutoridad(Autoridad autoridad);
    void deleteAutoridad(Long id);
    Autoridad getAutoridadById(Long id);
    List<Autoridad> getAllAutoridades();
    List<Autoridad> getAutoridadesByDistrito(Long distritoId);
    List<Autoridad> getAutoridadesByTipo(String tipo);
    boolean hasActiveAudiencias(Long autoridadId);
}

