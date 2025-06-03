package com.MundoVerde.CultivoManager.repositories;

import com.MundoVerde.CultivoManager.entities.ZonaCultivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaCultivoRepository extends JpaRepository<ZonaCultivo, Long> {
}
