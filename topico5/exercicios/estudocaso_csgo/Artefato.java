/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_csgo;

/**
 *
 * @author 20202PF.CC0012
 */
public abstract class Artefato {
    private Integer id;
    private String nome;
    private Float peso;
    private Float valor;
    
    public Artefato() {
    }

    public Artefato(Integer id, String nome, Float peso, Float valor) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getPeso() {
        return peso;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }
    
}
