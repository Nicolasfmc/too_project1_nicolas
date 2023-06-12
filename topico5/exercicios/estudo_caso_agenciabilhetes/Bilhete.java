/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes;

import br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes.*;

/**
 *
 * @author 20202PF.CC0012
 */
public abstract class Bilhete {
    private Long id;
    private Integer numero;
    private String assento;
    private Passageiro passageiro;
    private Horario horario;
    
    Bilhete(){};
    
    public void Reservar(Passageiro passageiro){
        this.passageiro = passageiro;
    };
    
    public void Comprar() {
        this.passageiro = passageiro;
        this.horario = horario;
    };
    
    public void CancelarReserva() {};
    
    public void CheckIn(Bagagem bagagem) {};
    
//  Abstract maxBagagens???? como que faz.
}
