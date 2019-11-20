package com.mycompany.trabalhooo;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Geral
 */
public class Disciplina {
    // tem turmas, professores, alunos, notas, departamento
    //ronan: acredito que os atributos alunos e notas devam estar em turma
    private String nome;
    
     //seria necessário?
    
    
    //lista de todas as turmas
    public List<Turma> turmas;
    
    public Disciplina(){
         turmas = new ArrayList<>();
    }
    
    //

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
