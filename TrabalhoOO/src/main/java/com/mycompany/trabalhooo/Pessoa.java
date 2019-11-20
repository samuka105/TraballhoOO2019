/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

import javax.swing.JOptionPane;

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
    
    public void setLogin(String usuario, char [] senha) throws Exception{
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
    public void setNomeComp(String nomeComp) throws Exception {

        if(nomeComp.split(" ").length >= 2)  this.nomeComp = nomeComp;
        else{
            JOptionPane.showMessageDialog(null, "Digite seu nome completo!");
            throw new Exception ();
        }   
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
    public void setIdade(String idade) throws Exception {
    
        int i = Integer.parseInt(idade);
        if(i < 16 || i > 100){
            JOptionPane.showMessageDialog(null, "Idade inválida! A idade deve ser maior que 16 e menor que 100!");
            throw new Exception();
        }    
        else this.idade = idade;
        
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
    public void setEmail(String email) throws Exception {
        
        if(email.contains("@")) this.email = email;
        else{
            JOptionPane.showMessageDialog(null, "Email invalido!");
            throw new Exception();
        }
        
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
    public void setCpf(String cpf) throws Exception {
            
        if(cpf.length() != 11){
            JOptionPane.showMessageDialog(null, "CPF Inválido!");
            throw new Exception();
        }
        else this.cpf = cpf;  
    }
}