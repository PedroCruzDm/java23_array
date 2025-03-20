package com.whispe2.whispe2.model;

import org.hibernate.validator.constraints.br.CPF;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class usuario {

    @NotNull (message = "Id não pode ser nulo")
    @NotBlank (message = "Id não pode ser vazio")
    private Integer id;

    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;

    @CPF (message = "CPF inválido")
    @NotNull (message = "CPF não pode ser nulo")
    @NotBlank (message = "CPF não pode ser branco")
    private String cpf;

    public usuario(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
