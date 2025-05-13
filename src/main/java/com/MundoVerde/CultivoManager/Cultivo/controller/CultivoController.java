// package com.MundoVerde.CultivoManager.Cultivo.controller;


// import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
// import com.MundoVerde.CultivoManager.Cultivo.service.CultivoService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/cultivos")
// @CrossOrigin(origins = "*") // útil para pruebas con frontend
// public class CultivoController {

//     private final CultivoService cultivoService;

//     public CultivoController(CultivoService cultivoService) {
//         this.cultivoService = cultivoService;
//     }

//     @GetMapping
//     public List<Cultivo> listar() {
//         return cultivoService.obtenerTodos();
//     }

//     @PostMapping
//     public Cultivo crear(@RequestBody Cultivo cultivo) {
//         return cultivoService.guardar(cultivo);
//     }

//     @DeleteMapping("/{id}")
//     public void eliminar(@PathVariable Long id) {
//         cultivoService.eliminar(id);
//     }
// }








// package com.MundoVerde.CultivoManager.Cultivo.controller;

// import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
// import com.MundoVerde.CultivoManager.Cultivo.service.CultivoService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @Controller
// @RequestMapping("/cultivos")
// public class CultivoController {

//     private final CultivoService cultivoService;

//     public CultivoController(CultivoService cultivoService) {
//         this.cultivoService = cultivoService;
//     }

//     // Mostrar formulario para nuevo cultivo
//     @GetMapping("/nuevo")
//     public String mostrarFormulario(Model model) {
//         model.addAttribute("cultivo", new Cultivo());
//         return "formularioCUltivo"; // Corresponde al archivo formularioCultivo.html en templates
//     }

//     // Procesar formulario y guardar cultivo
//     @PostMapping("/guardar")
//     public String guardarCultivo(@ModelAttribute Cultivo cultivo) {
//         cultivoService.guardar(cultivo);
//         return "redirect:/cultivos/lista";
//     }

//     // Mostrar lista de cultivos
//     @GetMapping("/lista")
//     public String listarCultivos(Model model) {
//         List<Cultivo> cultivos = cultivoService.obtenerTodos();
//         model.addAttribute("cultivos", cultivos);
//         return "lista-cultivos"; // Corresponde al archivo lista-cultivos.html en templates
//     }

//     // Eliminar cultivo por ID
//     @GetMapping("/eliminar/{id}")
//     public String eliminarCultivo(@PathVariable Long id) {
//         cultivoService.eliminar(id);
//         return "redirect:/cultivos/lista";
//     }
// }
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
