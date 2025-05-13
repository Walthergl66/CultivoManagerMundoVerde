package com.MundoVerde.CultivoManager.Cultivo.service;

import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
import com.MundoVerde.CultivoManager.Cultivo.repository.CultivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CultivoService {

    private final CultivoRepository cultivoRepository;

    public CultivoService(CultivoRepository cultivoRepository) {
        this.cultivoRepository = cultivoRepository;
    }

    public List<Cultivo> obtenerTodos() {
        return cultivoRepository.findAll();
    }

    public Cultivo guardar(Cultivo cultivo) {
        return cultivoRepository.save(cultivo);
    }

    public void eliminar(Long id) {
        cultivoRepository.deleteById(id);
    }
}

