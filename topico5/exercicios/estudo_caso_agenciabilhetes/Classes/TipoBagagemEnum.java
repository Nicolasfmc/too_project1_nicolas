/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public enum TipoBagagemEnum {
    MAO(1, "mão", 5.0),
    NACIONAL(2, "nacional", 23.0),
    INTERNACIONAL(3, "internacional", 32.0);

    private final long id;
    private final String nome;
    private final double pesoMax;

    TipoBagagemEnum(long id, String nome, double pesoMax) {
        this.id = id;
        this.nome = nome;
        this.pesoMax = pesoMax;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPesoMax() {
        return pesoMax;
    }
}
