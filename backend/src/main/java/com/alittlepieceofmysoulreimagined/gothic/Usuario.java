package com.alittlepieceofmysoulreimagined.gothic;

public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String generoFavorito;
    private String bandaFavorita;
    private String senha;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String generoFavorito, String bandaFavorita, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.generoFavorito = generoFavorito;
        this.bandaFavorita = bandaFavorita;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String generoFavorito, String bandaFavorita, String senha) {
        this.nome = nome;
        this.email = email;
        this.generoFavorito = generoFavorito;
        this.bandaFavorita = bandaFavorita;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBandaFavorita() {
        return bandaFavorita;
    }

    public void setBandaFavorita(String bandaFavorita) {
        this.bandaFavorita = bandaFavorita;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}