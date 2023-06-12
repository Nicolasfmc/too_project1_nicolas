/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public class Aviao {
    private Long id;
    private String codigo;
    private Double carga;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;
    private CiaAerea ciaAerea;
    
    Aviao(){}

    public Aviao(Long id, String codigo, Double carga, Integer qtdEconomica, Integer qtdPrimeira, Integer qtdExecutiva, CiaAerea ciaAerea) {
        this.id = id;
        this.codigo = codigo;
        this.carga = carga;
        this.qtdEconomica = qtdEconomica;
        this.qtdPrimeira = qtdPrimeira;
        this.qtdExecutiva = qtdExecutiva;
        this.ciaAerea = ciaAerea;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCiaAerea(CiaAerea ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public CiaAerea getCiaAerea() {
        return ciaAerea;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setQtdEconomica(Integer qtdEconomica) {
        this.qtdEconomica = qtdEconomica;
    }

    public Integer getQtdEconomica() {
        return qtdEconomica;
    }

    public void setQtdExecutiva(Integer qtdExecutiva) {
        this.qtdExecutiva = qtdExecutiva;
    }

    public Integer getQtdExecutiva() {
        return qtdExecutiva;
    }

    public void setQtdPrimeira(Integer qtdPrimeira) {
        this.qtdPrimeira = qtdPrimeira;
    }

    public Integer getQtdPrimeira() {
        return qtdPrimeira;
    }
    
}
