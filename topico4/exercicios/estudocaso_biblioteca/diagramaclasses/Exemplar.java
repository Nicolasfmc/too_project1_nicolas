package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author 20202pf.cc0012
 */

public class Exemplar {
    private Integer id;
    private Boolean situacao;
    private Livro livro;
    
    
    Exemplar() {}
    
    Exemplar(Integer id, Boolean situacao, Livro livro) {
        this.id = id;
        this.situacao = situacao;
        this.livro = livro;
    }

//    Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    Situacao
    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

//    Livro
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
