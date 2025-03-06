package com.TallerAudiencias.audiencias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistritoJudicialRepository extends JpaRepository<Distritojudicial, Long> {

    @Override
    Optional<Distritojudicial> findById(Long distritoJudicialId);
}
