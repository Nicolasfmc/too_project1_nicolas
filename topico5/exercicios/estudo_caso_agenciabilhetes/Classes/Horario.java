/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

import java.util.Calendar;

/**
 *
 * @author 20202PF.CC0012
 */
public class Horario {
    private Long id;
    private String codigo;
    private Calendar partida;
    private Calendar chegada;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;
    private Aviao aviao;
    private Rota rota;
    
    Horario(){};

    public Horario(Long id, String codigo, Calendar partida, Calendar chegada, Integer qtdEconomica, Integer qtdPrimeira, Integer qtdExecutiva, Aviao aviao, Rota rota) {
        this.id = id;
        this.codigo = codigo;
        this.partida = partida;
        this.chegada = chegada;
        this.qtdEconomica = qtdEconomica;
        this.qtdPrimeira = qtdPrimeira;
        this.qtdExecutiva = qtdExecutiva;
        this.aviao = aviao;
        this.rota = rota;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setChegada(Calendar chegada) {
        this.chegada = chegada;
    }

    public Calendar getChegada() {
        return chegada;
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

    public void setPartida(Calendar partida) {
        this.partida = partida;
    }

    public Calendar getPartida() {
        return partida;
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

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public Rota getRota() {
        return rota;
    }
    
}
