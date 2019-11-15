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
    

    public Aluno() {
        super();
        
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
    public void setMatricula(int cont) {
        int aux = cont -14;
        this.matricula = Integer.toString(aux) + "-" + "A";
    }
    
    //metodo matricular 
    // metodo ver nota
    // metodo ver historico
    // metodo tranca
    
    public void imprimeAluno(){
        System.out.println("Nome:"+ this.getNomeComp());
        System.out.println("Idade:"+ this.getIdade());
        System.out.println("Email:"+ this.getEmail());
        System.out.println("Cpf:"+ this.getCpf());
        System.out.println("Matricula:"+ this.getMatricula());
        //System.out.println("Login:"+ this.login.getLogin());
        //System.out.println("Senha:"+ this.login.getSenha());
    }
}
