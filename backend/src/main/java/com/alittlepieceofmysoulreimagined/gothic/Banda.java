package com.alittlepieceofmysoulreimagined.gothic;

public class Banda {
    private Integer idBanda;
    private String nome;

    public Banda() {
    }

    public Banda(Integer idBanda, String nome) {
        this.idBanda = idBanda;
        this.nome = nome;
    }

    public Integer getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(Integer idBanda) {
        this.idBanda = idBanda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
