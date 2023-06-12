/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

/**
 *
 * @author 20202PF.CC0012
 */
public class Rota {
    private Long id;
    private String nome;
    private String descricao;
    private Aeroporto aeroporto;
    
    Rota(){};

    public Rota(Long id, String nome, String descricao, Aeroporto aeroporto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.aeroporto = aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
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
    
}
