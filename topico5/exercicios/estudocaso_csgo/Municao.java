/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_csgo;

/**
 *
 * @author 20202PF.CC0012
 */
public class Municao extends Artefato{
    private Boolean explosiva;
    private Calibre calibre;
    
    public Municao() {
    }

    public Municao(Boolean explosiva, Calibre calibre) {
        this.explosiva = explosiva;
        this.calibre = calibre;
    }

    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    public Boolean getExplosiva() {
        return explosiva;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

    public Calibre getCalibre() {
        return calibre;
    }
    
}
