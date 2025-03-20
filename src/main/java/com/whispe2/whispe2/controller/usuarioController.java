package com.whispe2.whispe2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import com.whispe2.whispe2.model.usuario;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private Validator validator;

    @GetMapping("/show")
    public ResponseEntity<List<usuario>> getUsuarios() {
        List<usuario> usuarios = new ArrayList<>();
        usuarios.add(new usuario(1, "João", "123.456.789-00"));
        usuarios.add(new usuario(2, "Maria", "987.654.321-00"));
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insertUsuario(@Valid @RequestBody usuario usuario) {
        Set<ConstraintViolation<usuario>> violations = validator.validate(usuario);
        System.out.println("Usuário inserido: " + usuario);
        return ResponseEntity.ok(usuario);
    }
}
