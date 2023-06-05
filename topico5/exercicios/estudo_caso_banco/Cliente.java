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
public class Cliente {
    private String endereco;
    private String bairro;
    private String telefone;
    private Calendar ultimaCompra;
    
    Cliente(){}
    
    Cliente(String endereco, String bairro, String telefone, Calendar ultimaCompra){
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.ultimaCompra = ultimaCompra;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Calendar ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }
}
