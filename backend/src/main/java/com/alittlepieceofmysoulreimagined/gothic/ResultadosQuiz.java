package com.alittlepieceofmysoulreimagined.gothic;

import java.time.LocalDate;

public class ResultadosQuiz {
    private Integer idResultado;
    private Integer fkCadastro;
    private Integer fkQuiz;
    private String resultado;
    private LocalDate dtResultado;

    public ResultadosQuiz() {
    }

    public ResultadosQuiz(Integer fkCadastro, Integer fkQuiz, String resultado, LocalDate dtResultado) {
        this.fkCadastro = fkCadastro;
        this.fkQuiz = fkQuiz;
        this.resultado = resultado;
        this.dtResultado = dtResultado;
    }

    public ResultadosQuiz(Integer idResultado, Integer fkCadastro, Integer fkQuiz, String resultado, LocalDate dtResultado) {
        this.idResultado = idResultado;
        this.fkCadastro = fkCadastro;
        this.fkQuiz = fkQuiz;
        this.resultado = resultado;
        this.dtResultado = dtResultado;
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public Integer getFkCadastro() {
        return fkCadastro;
    }

    public void setFkCadastro(Integer fkCadastro) {
        this.fkCadastro = fkCadastro;
    }

    public Integer getFkQuiz() {
        return fkQuiz;
    }

    public void setFkQuiz(Integer fkQuiz) {
        this.fkQuiz = fkQuiz;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public LocalDate getDtResultado() {
        return dtResultado;
    }

    public void setDtResultado(LocalDate dtResultado) {
        this.dtResultado = dtResultado;
    }
}
