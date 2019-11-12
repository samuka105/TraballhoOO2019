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
public class Turma {
    // tem  Lista de alunos, professor associado e um código
    private String codigo;
    private Professor docente;
    private List<Aluno> alunos;
    private int maxAlunos;
    public List<Notas> notasAlunos;
    
    public Turma(String codigo){
        
    }
    
    
    
    
    
    //criar metodos de inserção em ordem alfabetica
    //metodo de lançar notas no historico escolar
    //metodo 

    public Turma(String codigo, Professor docente, int maxAlunos) {
        this.codigo = codigo;
        this.docente = docente;
        this.maxAlunos = maxAlunos;
        this.alunos = new ArrayList<>();
    }
}
