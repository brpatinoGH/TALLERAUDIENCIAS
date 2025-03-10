package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Audiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AudienciaRepository extends JpaRepository<Audiencia, Long> {

    List<Audiencia> findByAudFechaBetween(LocalDate inicio, LocalDate fin);
    List<Audiencia> findBySalId(Long salaId);
    List<Audiencia> findByAutId(Long autoridadId);
    List<Audiencia> findByAudTipo(String tipo);
    List<Audiencia> findByAudEstado(String estado);
}
