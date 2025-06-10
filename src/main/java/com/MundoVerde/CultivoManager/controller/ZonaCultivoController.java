package com.MundoVerde.CultivoManager.controller;

import com.MundoVerde.CultivoManager.Models.ZonaCultivo;
import com.MundoVerde.CultivoManager.service.ZonaCultivoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonas")
public class ZonaCultivoController {

    private final ZonaCultivoService zonaCultivoService;

    public ZonaCultivoController(ZonaCultivoService zonaCultivoService) {
        this.zonaCultivoService = zonaCultivoService;
    }

    @GetMapping
    public List<ZonaCultivo> getAll() {
        return zonaCultivoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ZonaCultivo> getById(@PathVariable Long id) {
        return zonaCultivoService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ZonaCultivo create(@RequestBody ZonaCultivo zona) {
        return zonaCultivoService.save(zona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ZonaCultivo> update(@PathVariable Long id, @RequestBody ZonaCultivo zona) {
        return zonaCultivoService.getById(id)
                .map(existing -> {
                    zona.setId(id);
                    return ResponseEntity.ok(zonaCultivoService.save(zona));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (zonaCultivoService.getById(id).isPresent()) {
            zonaCultivoService.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
