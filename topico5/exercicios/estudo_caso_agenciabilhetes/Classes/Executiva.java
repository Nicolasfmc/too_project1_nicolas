/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.Classes;

import java.util.Collection;

/**
 *
 * @author 20202PF.CC0012
 */
public class Executiva {
    private Collection<Bagagem> bagagens;
    
    Executiva(){};

    public Executiva(Collection<Bagagem> bagagens) {
        this.bagagens = bagagens;
    }

    public Collection<Bagagem> getBagagens() {
        return bagagens;
    }

    public void setBagagens(Bagagem bagagem) {
        try {
            if(this.bagagens.size() <= 2){
                this.bagagens.add(bagagem);
            }
        } catch (Exception e) {
            System.out.println("Limite de bagagens atingido! {2}");
        }
    }
    
    
}
 