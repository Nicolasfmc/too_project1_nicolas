/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_banco;

import java.util.Calendar;

/**
 *
 * @author 20202PF.CC0012
 */
public class ClientePessoaFisica extends Cliente{
    private String cpf;
    private String nome;
    private Calendar nascimento;
    
    ClientePessoaFisica() {}
    
    ClientePessoaFisica(String cpf, String nome, Calendar nascimento, String endereco, String bairro, String telefone, Calendar ultimaCompra) {
        super(endereco, bairro, telefone, ultimaCompra);
        
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
