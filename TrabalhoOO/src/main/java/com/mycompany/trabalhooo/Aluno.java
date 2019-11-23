/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Geral
 */
public class Aluno extends Pessoa{
    private String matricula;
    public List<Turma> minhasTurmas;
    
    public Aluno() {
        super();
        minhasTurmas = new ArrayList<>();
    }
    /**
     * @return the matricula
     */
    @Override
    public String getIdentificacao() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    @Override
    public void setIdentificacao(int cont) {
        int aux = cont -14;
        this.matricula = Integer.toString(aux) + "-" + "A";
    }   
    
    //metodo matricular DEFININDO
   
    // metodo ver nota
    // metodo ver historico
    // metodo tranca
    
    public void imprimeAluno(){
        System.out.println("Nome:"+ this.getNomeComp());
        System.out.println("Idade:"+ this.getIdade());
        System.out.println("Email:"+ this.getEmail());
        System.out.println("Cpf:"+ this.getCpf());
        //System.out.println("Matricula:"+ this.getMatricula());
        //System.out.println("Login:"+ this.login.getLogin());
        //System.out.println("Senha:"+ this.login.getSenha());
    }
}
