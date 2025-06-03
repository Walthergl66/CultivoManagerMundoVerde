package com.MundoVerde.CultivoManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MundoVerde.CultivoManager.domain.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
