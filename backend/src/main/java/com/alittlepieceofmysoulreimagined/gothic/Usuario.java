package com.alittlepieceofmysoulreimagined.gothic;

import java.time.LocalDate;

public class Usuario {
    private Integer id;
    private Integer fkBanda;
    private String nome;
    private String email;
    private String generoFavorito;
    private String senha;
    private LocalDate dtNascimento;

    public Usuario() {
    }

    public Usuario(Integer fkBanda, String nome, String email, String generoFavorito, String senha, LocalDate dtNascimento) {
        this.fkBanda = fkBanda;
        this.nome = nome;
        this.email = email;
        this.generoFavorito = generoFavorito;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
    }

    public Usuario(Integer id, Integer fkBanda, String nome, String email, String generoFavorito, String senha, LocalDate dtNascimento) {
        this.id = id;
        this.fkBanda = fkBanda;
        this.nome = nome;
        this.email = email;
        this.generoFavorito = generoFavorito;
        this.senha = senha;
        this.dtNascimento = dtNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkBanda() {
        return fkBanda;
    }

    public void setFkBanda(Integer fkBanda) {
        this.fkBanda = fkBanda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}