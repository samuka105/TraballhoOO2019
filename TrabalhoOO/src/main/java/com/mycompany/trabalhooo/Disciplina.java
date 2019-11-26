package com.mycompany.trabalhooo;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Geral
 */
public class Disciplina {

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    // tem turmas, professores, alunos, notas, departamento
    //ronan: acredito que os atributos alunos e notas devam estar em turma
    private String nome;
    
    private String codigo;
    
    
    //lista de todas as turmas
    private List<Turma> turmas;
    //public List<Professor> professores;
    public Disciplina(){
        this.turmas = new ArrayList<>();
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

    /**
     * @return the turmas
     */
    public List<Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas the turmas to set
     */
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    
}
