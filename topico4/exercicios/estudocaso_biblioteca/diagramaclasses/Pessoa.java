
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public abstract class Pessoa {
    
    /* campos da tabela -> atributos da instância*/
    private String cpf;
    private String rg;
    private String nome;
    private String logradouro;
    private String cep;
    private Integer numero;
    private String telefone;
    private Calendar data_cadastro;
    private Calendar data_nascimento;
    private Integer idade;
    
    /*construtor padrão: protegido e sem parâmetros. */
    public Pessoa(){
        
    }
    /*polimorfismo: vaŕias formas*/
    public Pessoa(String cpf, 
                  String rg, 
                  String nome, 
                  String logradouro,
                  String cep,
                  Integer numero,
                  String telefone,
                  Calendar data_cadastro,
                  Calendar data_nascimento){
        //atributo da instancia recebe o valor recebido por parâmetro.
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.telefone = telefone;
        this.data_cadastro = data_cadastro;
        this.data_nascimento = data_nascimento;
        //Exercicio para 15/05/2023 - calcular aqui a idade da pessoa.
        this.idade = 0;
        
        int ano_nascimento = data_nascimento.get(Calendar.YEAR);
        
        int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
        
        this.idade = ano_atual - ano_nascimento;
        
    }
    public String getCPF(){
        return this.cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public void setDataNascimento(Calendar c){
        this.data_nascimento = c;        
        //Exercicio para 15/05/2023 - calcular aqui a idade da pessoa.        
        this.idade = 0;
    }
    public Calendar getDataNascimento(){
        return this.data_nascimento;
    }
    
}
