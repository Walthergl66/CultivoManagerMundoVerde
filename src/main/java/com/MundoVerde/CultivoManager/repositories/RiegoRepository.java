package com.MundoVerde.CultivoManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MundoVerde.CultivoManager.domain.Riego;

@Repository
public interface RiegoRepository extends JpaRepository<Riego, Long> {
}
