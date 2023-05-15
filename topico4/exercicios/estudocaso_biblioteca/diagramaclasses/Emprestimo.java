/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author 20202pf.cc0012
 */
public class Emprestimo {
    private Integer id;
    private Calendar data;
    private Calendar data_devolucao;
    private Boolean situacao;
    private Funcionario funcionario;
    private Aluno aluno;
    private Exemplar exemplar;
    
    Emprestimo() {}
    
    Emprestimo(
            Integer id,
            Calendar data,
            Calendar data_devolucao,
            Boolean situacao,
            Funcionario funcionario,
            Aluno aluno,
            Exemplar exemplar
    ) {
        this.id = id;
        this.data = data;
        this.data_devolucao = data_devolucao;
        this.situacao = situacao;
        this.funcionario = funcionario;
        this.aluno = aluno;
        this.exemplar = exemplar;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Calendar data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }
}
