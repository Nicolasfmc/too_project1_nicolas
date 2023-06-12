/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public class Papel {
    private Long id;
    private String nome;
    private String descricao;
    private CiaAerea ciaAerea;
    
    Papel(){};

    public Papel(Long id, String nome, String descricao, CiaAerea ciaAerea) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ciaAerea = ciaAerea;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
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

    public void setCiaAerea(CiaAerea ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public CiaAerea getCiaAerea() {
        return ciaAerea;
    }
    
}
