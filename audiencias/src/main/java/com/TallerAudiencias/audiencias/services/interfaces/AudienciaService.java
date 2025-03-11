package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.Audiencia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AudienciaService {
    Audiencia createAudiencia(Audiencia audiencia);
    Audiencia updateAudiencia(Audiencia audiencia);
    void cancelAudiencia(Long id);
    Audiencia getAudienciaById(Long id);
    List<Audiencia> getAllAudiencias();
    List<Audiencia> getAudienciasByFecha(LocalDate fecha);
    List<Audiencia> getAudienciasByRangoFechas(LocalDate inicio, LocalDate fin);
    List<Audiencia> getAudienciasBySala(Long salaId);
    List<Audiencia> getAudienciasByAutoridad(Long autoridadId);
    List<Audiencia> getAudienciasByTipo(String tipo);
    List<Audiencia> getAudienciasByEstado(String estado);
    boolean isAutoridadDisponible(Long autoridadId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin);
    boolean isSalaDisponible(Long salaId, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin);
}
