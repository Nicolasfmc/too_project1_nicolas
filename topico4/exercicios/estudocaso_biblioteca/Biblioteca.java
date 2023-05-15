
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;

import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Aluno;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Funcionario;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20202pf.cc0012
 */
public class Biblioteca {
    
    Biblioteca(){
        getPessoasCollection();
    }
    
    void getPessoasCollection(){
        Collection<Pessoa> collection = new ArrayList();
        
        Aluno a = new Aluno("202020012");
        Aluno b = new Aluno("202211343");
        Aluno c = new Aluno("2027865343");
        Funcionario d = new Funcionario("1235");
        Funcionario e = new Funcionario("9876");
        
        collection.add(a);
        collection.add(b);
        collection.add(c);
        collection.add(d);
        collection.add(e);
        
        for (Pessoa pessoa : collection) {
            System.out.println(pessoa);
        }
    }
    
    public static void main(String args[]){
        /* métod estático*/
        new Biblioteca();
        // https://plantuml.com/ie-diagram
    }
}
