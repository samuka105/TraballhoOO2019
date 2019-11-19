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
public abstract class Pessoa { //classe abstrata - não instacia objetos
//metodos padrao para aluno e professor
    private String nomeComp;
    private String idade;
    private String email;
    private String cpf;
    private Login login;
    
    public void setLogin(String usuario, char [] senha){
        login.setLogin(usuario);
        login.setSenha(senha);
    }
    public Login getLogin(){
        return login;
    }
    /**
     */

    public Pessoa(){
        this.login = new Login();
    }    

    public String getNomeComp() {
        return nomeComp;
    }

    /**
     * @param nomeComp the nomeComp to set
     */
    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
