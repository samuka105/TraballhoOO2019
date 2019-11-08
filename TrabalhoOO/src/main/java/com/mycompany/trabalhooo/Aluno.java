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
    private Login login = new Login();

    public Aluno(String nomeComp, int idade, String email, String cpf, String matricula) {
        super(nomeComp, idade, email, cpf);
        this.matricula = matricula; //Enedilson : adicionando Matricula na construçao
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
    public void setLogin(String usuario, String senha){
        login.setLogin(usuario);
        login.setSenha(senha);
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
        System.out.println("Login:"+ this.login.getLogin());
        System.out.println("Senha:"+ this.login.getSenha());
    }
}
