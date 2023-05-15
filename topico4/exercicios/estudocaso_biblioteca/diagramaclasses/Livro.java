/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Collection;

/**
 *
 * @author 20202pf.cc0012
 */
public class Livro {
    private String titulo;
    private Integer id;
    private Collection<PalavrasChave> palavrasChave;
    
    Livro() {}
    
    Livro(String titulo, Integer id) {
        this.titulo = titulo;
        this.id = id;
    }

//    Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

//    Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
