/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Geral
 */
public class Turma {
    // tem  Lista de alunos, professor associado e um código
    private String codigo;
    private Professor docente;
    public List<Aluno> alunos;
    private int maxAlunos;
    private HashMap<Aluno, Notas> notasAlunos;
    
    public Turma(String codigo, int max){
        this.setCodigo(codigo);
        this.maxAlunos = maxAlunos;
        this.alunos = new ArrayList<>();
    }
    
    //MATRICULAR
    public void setCodigo(String a){
        this.codigo = a;
    }
    public String getCodigo(){
        return codigo;
    }
    public void matricular(Aluno a) throws Exception{
        
        
        try{
            if(alunos.size() >= this.maxAlunos) throw new Exception();
            else alunos.add(a);
            //Turma com vagas
        } catch(Exception e){
            System.out.println("ERRO! Turma cheia.");
            //Turma cheia
        }
    }
    
    public void tranca(Aluno a){
        alunos.remove(a);
        //Remove objeto Aluno
    }
    
    public void preencheNotas()
    {
        for(int i = 0; i < alunos.size(); i++){
            Notas nota = new Notas();
            notasAlunos.put(alunos.get(i),nota);
        }
    }
    
    public void lancarNota(Aluno a, float tvc1, float tvc2, float tvc3){
        Notas nota = notasAlunos.get(a);
        nota.setTvc1(tvc1);
        nota.setTvc2(tvc2);
        nota.setTvc3(tvc3);
    }
    
    public void verNota(Aluno a){
        Notas nota = notasAlunos.get(a);
        nota.getTvc1();
        nota.getTvc2();
        nota.getTvc3();
    }
    //VER NOTA
    /*public void verNota(Aluno a)
    {
        
    }*/
    
    
    //criar metodos de inserção em ordem alfabetica
    //metodo de lançar notas no historico escolar
    //metodo 

//    public Turma(int maxAlunos) {    
//        this.maxAlunos = maxAlunos;
//        this.alunos = new ArrayList<>();
//    }
    
    public Professor getProfessor(){
        return docente;
    }
    
    public void AlocaProfTurma(Professor docente){
        this.docente = docente;
    }


}

 