package com.mycompany.trabalhooo;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Geral
 */
public class Departamento {
    private String nome;
   
    
    //criar um arraylist com todos os professores, todas as disciplinas
    
    List<Disciplina> disciplinas ;
    
    //cada depatarmento terá somente um curso?
    
    
    // tem as disciplinas, os professores, cursos
    
   
    public Departamento(){         
        disciplinas = new ArrayList<>();
    }
    
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

    /**
     * @return the email
     */
    public void addDisciplina(Disciplina nova){
        disciplinas.add(nova);
    }
    
    
    //será que vai precisar de metodos deste tipo? Ou ja iremos inserir direto?
    
    }
   

