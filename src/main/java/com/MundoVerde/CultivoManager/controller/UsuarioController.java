package com.MundoVerde.CultivoManager.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.MundoVerde.CultivoManager.entities.Usuario;
import com.MundoVerde.CultivoManager.service.UsuarioService;

import java.util.List;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.obtenerTodos();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }


    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminar(id);
    }
}



//  CODIGO PARA RUTAS CON FRONT 


// @Controller
// @RequestMapping("/usuarios")
// public class UsuarioController {

//     private final UsuarioService usuarioService;

//     public UsuarioController(UsuarioService usuarioService) {
//         this.usuarioService = usuarioService;
//     }

//     @GetMapping("/lista")
//     public String listarUsuarios(Model model) {
//         List<Usuario> usuarios = usuarioService.obtenerTodos();
//         model.addAttribute("usuarios", usuarios);
//         return "lista-usuarios"; // Tu archivo HTML debe llamarse lista-usuarios.html
//     }

//     @GetMapping("/nuevo")
//     public String registrarUsuario(Model model) {
//         model.addAttribute("usuario", new Usuario());
//         return "register-usuario"; // Tu archivo HTML debe llamarse register-usuario.html
//     }

//     @PostMapping("/guardar")
//     public String guardarUsuario(@ModelAttribute Usuario usuario) {
//         usuarioService.guardar(usuario);
//         return "redirect:/usuarios/lista";
//     }

//     @GetMapping("/eliminar/{id}")
//     public String eliminarUsuario(@PathVariable Long id) {
//         usuarioService.eliminar(id);
//         return "redirect:/usuarios/lista";
//     }
