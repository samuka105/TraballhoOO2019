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
public class Professor extends Pessoa {
    private String siap;
    public List<Disciplina> disciplinasProf;
    @Override
    public String getIdentificacao() {
        return siap;
    }

    @Override
    public void setIdentificacao(int cont) {
        int aux = (cont -13);
        this.siap = Integer.toString(aux);
    }
    // anexado a uma ou mais disciplinas, a uma ou mais turmas e pode alterar as notas dos alunos

    public Professor() {
        super();
        this.disciplinasProf = new ArrayList<>();
    }
 
}
