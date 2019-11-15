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
public class Professor extends Pessoa {
    private String siap;
    public String getSiap() {
        return siap;
    }

    public void setSiap(int cont) {
        int aux = (cont -13);
        this.siap = Integer.toString(aux);
    }
    // anexado a uma ou mais disciplinas, a uma ou mais turmas e pode alterar as notas dos alunos
    
    

    public Professor() {
        super();
        
    }
    
    
    
}
