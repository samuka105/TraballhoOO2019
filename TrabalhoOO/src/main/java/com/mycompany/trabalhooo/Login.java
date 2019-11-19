/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author Ronan
 */
public class Login {
    
    private String login;
    private char[] senha;

    public Login() {
    }
    
    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * @param senha the senha to set
     */
    public void setSenha(char [] senha) {
        this.senha = senha;
    }
    /**
     * @return the senha
     */
    public char[] getSenha() {
        return senha;
    }

    
}
