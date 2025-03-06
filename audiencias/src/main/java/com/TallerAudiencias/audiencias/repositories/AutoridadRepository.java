package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Autoridad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoridadRepository extends JpaRepository<Autoridad, Long> {

    List<Autoridad> findByAutNombre(String autNombre);

    List<Autoridad> findByAutEmail(String autEmail);
}
