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
public class Passageiro extends Pessoa{
    private String documento;
    private String numeroCartao;

    Passageiro() {};

    public Passageiro(String documento, String numeroCartao, Long id, String nome, String email, String telefone, String usuario, String senha, Calendar dataNascimento) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.documento = documento;
        this.numeroCartao = numeroCartao;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
}
