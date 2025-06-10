package com.MundoVerde.CultivoManager.service;

import com.MundoVerde.CultivoManager.Models.ZonaCultivo;
import com.MundoVerde.CultivoManager.repository.ZonaCultivoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaCultivoService {

    private final ZonaCultivoRepository zonaCultivoRepository;

    public ZonaCultivoService(ZonaCultivoRepository zonaCultivoRepository) {
        this.zonaCultivoRepository = zonaCultivoRepository;
    }

    public List<ZonaCultivo> getAll() {
        return zonaCultivoRepository.findAll();
    }

    public Optional<ZonaCultivo> getById(Long id) {
        return zonaCultivoRepository.findById(id);
    }

    public ZonaCultivo save(ZonaCultivo zona) {
        return zonaCultivoRepository.save(zona);
    }

    public void delete(Long id) {
        zonaCultivoRepository.deleteById(id);
    }
}
