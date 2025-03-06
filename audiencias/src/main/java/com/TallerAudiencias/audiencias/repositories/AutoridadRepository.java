package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Autoridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutoridadRepository extends JpaRepository<Autoridad, Long> {

    @Override
    List<Autoridad> findAll();

    @Override
    Optional<Autoridad> findById(Long autoridadId);

    Optional<Autoridad> findByAutNombre(String autoridadNombre);

    Optional<Autoridad> findByAutEmail(String autEmail);
}
