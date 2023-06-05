/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_csgo;

/**
 *
 * @author 20202PF.CC0012
 */
public class Arma extends Artefato{
    private Float comprimento_cano;
    private Municao municao;
    private Tipo tipo;

    public Arma() {}

    public Arma(Float comprimento_cano, Municao municao, Tipo tipo) {
        this.comprimento_cano = comprimento_cano;
        this.municao = municao;
        this.tipo = tipo;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public void setMunicao(Municao municao) {
        this.municao = municao;
    }

    public Municao getMunicao() {
        return municao;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
}
