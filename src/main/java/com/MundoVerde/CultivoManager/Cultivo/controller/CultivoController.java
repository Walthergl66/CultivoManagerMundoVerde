package com.MundoVerde.CultivoManager.Cultivo.controller;


import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
import com.MundoVerde.CultivoManager.Cultivo.service.CultivoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cultivos")
@CrossOrigin(origins = "*") // útil para pruebas con frontend
public class CultivoController {

    private final CultivoService cultivoService;

    public CultivoController(CultivoService cultivoService) {
        this.cultivoService = cultivoService;
    }

    @GetMapping
    public List<Cultivo> listar() {
        return cultivoService.obtenerTodos();
    }

    @PostMapping
    public Cultivo crear(@RequestBody Cultivo cultivo) {
        return cultivoService.guardar(cultivo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cultivoService.eliminar(id);
    }
}
