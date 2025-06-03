package com.MundoVerde.CultivoManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MundoVerde.CultivoManager.domain.ZonaCultivo;

@Repository
public interface ZonaCultivoRepository extends JpaRepository<ZonaCultivo, Long> {
}
