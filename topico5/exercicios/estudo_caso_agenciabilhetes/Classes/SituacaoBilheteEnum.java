/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public enum SituacaoBilheteEnum {
    DISPONIVEL(1, "disponível"),
    RESERVADO(2, "reservado"),
    VENDIDO(3, "vendido");

    private final long id;
    private final String nome;

    SituacaoBilheteEnum(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

