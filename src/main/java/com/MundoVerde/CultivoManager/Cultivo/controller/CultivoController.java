
package com.MundoVerde.CultivoManager.Cultivo.controller;

import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
import com.MundoVerde.CultivoManager.Cultivo.service.CultivoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cultivos")
public class CultivoController {

    private final CultivoService cultivoService;

    public CultivoController(CultivoService cultivoService) {
        this.cultivoService = cultivoService;
    }

    @GetMapping("/lista")
    public String listarCultivos(Model model) {
        List<Cultivo> cultivos = cultivoService.obtenerTodos();
        model.addAttribute("cultivos", cultivos);
        return "lista-cultivos";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cultivo", new Cultivo());
        return "formularioCultivo"; // Corresponde al archivo formularioCultivo.html en templates
    }

    @PostMapping("/guardar")
    public String guardarCultivo(@ModelAttribute Cultivo cultivo) {
        cultivoService.guardar(cultivo);
        return "redirect:/cultivos/lista";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCultivo(@PathVariable Long id) {
        cultivoService.eliminar(id);
        return "redirect:/cultivos/lista";
    }
}
