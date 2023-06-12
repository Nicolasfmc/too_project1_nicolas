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
public class Funcionario extends Pessoa{
    private String codigo;
    private String contaCorrente;
    private Papel papel;
    
    Funcionario(){};

    public Funcionario(String codigo, String contaCorrente, Papel papel, Long id, String nome, String email, String telefone, String usuario, String senha, Calendar dataNascimento) {
        super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
        this.papel = papel;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public Papel getPapel() {
        return papel;
    }
    
    
}
