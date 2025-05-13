package com.MundoVerde.CultivoManager.Cultivo.repository;

import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultivoRepository extends JpaRepository<Cultivo, Long> {
}
