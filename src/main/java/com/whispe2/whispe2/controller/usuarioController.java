package com.whispe2.whispe2.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.whispe2.whispe2.model.usuario;

@RestController
@RequestMapping("/api/v1/usuario")
public class usuarioController {

    @GetMapping("/show")
    public List<usuario> getusuario() {
        List<usuario> usuarios = new ArrayList<>();
        usuarios.add(new usuario(1, "teste"));
        usuarios.add(new usuario(2, "teste2"));
        usuarios.add(new usuario(3, "teste3"));
        return usuarios;
    }
}
