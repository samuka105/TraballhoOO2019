package com.mycompany.trabalhooo;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Geral
 */
public class Departamento {
    private String nome;
    private String email;
    private String telefone;
    
    //criar um arraylist com todos os professores, todas as disciplinas
    List<Professor> professores = new ArrayList<>();
    List<Disciplina> disciplinas = new ArrayList<>();
    
    //cada depatarmento terá somente um curso?
    private String curso;
    
    // tem as disciplinas, os professores, cursos
    
    public Departamento(String nome, String email, String telefone, String curso){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.curso = curso;
    }
    public Departamento(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //será que vai precisar de metodos deste tipo? Ou ja iremos inserir direto?
    public void addProfessor( Professor novo){
        professores.add(novo);
    }
    public void addDisciplina(Disciplina nova){
        disciplinas.add(nova);
    }
    
}
