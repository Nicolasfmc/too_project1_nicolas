/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public class Bagagem {
    private Long id;
    private Double peso;
    private TipoBagagemEnum tipoBagagem;

    Bagagem() {};

    public Bagagem(Long id, Double peso, TipoBagagemEnum tipoBagagem) {
        this.id = id;
        this.peso = peso;
        this.tipoBagagem = tipoBagagem;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setTipoBagagem(TipoBagagemEnum tipoBagagem) {
        this.tipoBagagem = tipoBagagem;
    }

    public TipoBagagemEnum getTipoBagagem() {
        return tipoBagagem;
    }
    
}
