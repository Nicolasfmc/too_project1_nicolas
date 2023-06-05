/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_banco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Banco {
    private Collection<Cliente> clienteList;
    
    Banco() {}
            
    private Collection<Cliente> insertClienteCollection(){
        clienteList = new ArrayList();
        Calendar data = Calendar.getInstance();
        
        data.set(Calendar.YEAR, 1808);
        ClientePessoaFisica a = new ClientePessoaFisica("a", "a", data, "a", "a", "a", data);
        
        data.set(Calendar.YEAR, 2004);
        ClientePessoaFisica b = new ClientePessoaFisica("a", "a", data, "a", "a", "a", data);
        
        data.set(Calendar.YEAR, 2001);
        ClientePessoaFisica c = new ClientePessoaFisica("a", "a", data, "a", "a", "a", data);
        
        data.set(Calendar.YEAR, 2004);
        ClientePessoaJuridica d = new ClientePessoaJuridica("a", "a", "a", "a", "a", "a", data);
        
        
        return clienteList;
    }
    
    public static void main(String[] args){
        new Banco();
    }
}
