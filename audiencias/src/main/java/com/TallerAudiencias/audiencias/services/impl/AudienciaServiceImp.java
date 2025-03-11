package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.Audiencia;
import com.TallerAudiencias.audiencias.repositories.AudienciaRepository;
import com.TallerAudiencias.audiencias.services.interfaces.AudienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class AudienciaServiceImp implements AudienciaService {
    @Autowired
    private AudienciaRepository audienciaRepository;

    @Override
    public Audiencia createAudiencia(Audiencia audiencia) {
        return null;
    }

    @Override
    public Audiencia updateAudiencia(Audiencia audiencia) {
        return null;
    }

    @Override
    public void cancelAudiencia(Long id) {

    }

    @Override
    public Audiencia getAudienciaById(Long id) {
        return null;
    }

    @Override
    public List<Audiencia> getAllAudiencias() {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasByFecha(LocalDate fecha) {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasByRangoFechas(LocalDate inicio, LocalDate fin) {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasBySala(Long salaId) {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasByAutoridad(Long autoridadId) {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasByTipo(String tipo) {
        return List.of();
    }

    @Override
    public List<Audiencia> getAudienciasByEstado(String estado) {
        return List.of();
    }

    @Override
    public boolean isAutoridadDisponible(Long autoridadId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        return false;
    }

    @Override
    public boolean isSalaDisponible(Long salaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        return false;
    }
}
