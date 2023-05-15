/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author 20202pf.cc0012
 */
public class Funcionario extends Pessoa {
    private String numero_ctps;
    
    Funcionario() {}
    
    public Funcionario(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }
    
//    Funcionario(String numero_ctps){
//        this.numero_ctps = numero_ctps;
//    }
    
    public String getCtps(){
        return this.numero_ctps;
    }
    
    public void setCtps(String numero_ctps){
        this.numero_ctps = numero_ctps;
    }
}
