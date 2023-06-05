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
public class ClientePessoaJuridica extends Cliente{
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String bairro, String telefone, Calendar ultimaCompra) {
        super(endereco, bairro, telefone, ultimaCompra);
        
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
