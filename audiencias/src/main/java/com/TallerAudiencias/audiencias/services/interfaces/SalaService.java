package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.Sala;

import java.util.List;

public interface SalaService {
    Sala createSala(Sala sala);
    Sala updateSala(Sala sala);
    void deleteSala(Long id);
    Sala getSalaById(Long id);
    List<Sala> getAllSalas();
    List<Sala> getSalasByDistrito(Long distritoId);
}
