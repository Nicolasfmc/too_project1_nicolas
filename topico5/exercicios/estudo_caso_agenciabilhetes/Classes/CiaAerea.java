/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

import java.util.Collection;

/**
 *
 * @author 20202PF.CC0012
 */
public class CiaAerea {
    private Long id;
    private String nome;
    private Collection<Aviao> avioes;
    
    CiaAerea(){};

    public CiaAerea(Long id, String nome, Collection<Aviao> avioes) {
        this.id = id;
        this.nome = nome;
        this.avioes = avioes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Collection<Aviao> getAvioes() {
        return avioes;
    }

    public void setAvioes(Aviao aviao) {
        this.avioes.add(aviao);
    }
    
    
}
