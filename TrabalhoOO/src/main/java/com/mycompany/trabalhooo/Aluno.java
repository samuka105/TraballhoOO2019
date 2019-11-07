/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author Geral
 */
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nomeComp, int idade, String email, String cpf) {
        super(nomeComp, idade, email, cpf);
    }
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void Matricular(){
        //conferir se a turma nao esta cheia, se sim, colocar a matricula na lista de matriculados e ordenar por ordem alfabetica
        
    }
    //metodo matricular 
    // metodo ver nota
    // metodo ver historico
    // metodo tranca
    
    
}
