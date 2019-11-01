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
public class Pessoa { //metodos padrao para aluno e professor
    private String nomeComp;
    private int idade;
    private String email;
    private String cpf;
    /**
     * @return the nomeComp
     */

    public Pessoa(String nomeComp, int idade, String email, String cpf){
        this.nomeComp = nomeComp;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
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
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
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
