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
    // anexado a uma ou mais disciplinas, a uma ou mais turmas e pode alterar as notas dos alunos
    String siap;
    

    public Professor(String nomeComp, int idade, String email, String cpf,String siap) {
        super(nomeComp, idade, email, cpf);
        this.siap = siap; //Enedilson : adicionando Siap na construçao
    }
    
    
    
}
