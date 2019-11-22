/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.ArquivosDeDados.Arquivo;
import com.mycompany.trabalhooo.viewInterfacesGraficas.Constantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enedilson
 */
public class Dados {

    public static Arquivo arq;
    public List<Aluno> retornarArquivoAlunos(String arqAluno) {

        String toJsonAluno = arq.Read(arqAluno);
        Gson gson = new Gson();
        java.lang.reflect.Type myType = new TypeToken<List<Aluno>>() {
        }.getType();
        List<Aluno> alunos = gson.fromJson(toJsonAluno, myType);

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        return alunos;
    }

    public List<Professor> retornarArquivoProfessor(String arqProf) {

        
        String toJsonProfessor = arq.Read(arqProf);
        Gson gson = new Gson();
        java.lang.reflect.Type myType = new TypeToken<List<Professor>>() {
        }.getType();
        List<Professor> professores = gson.fromJson(toJsonProfessor, myType);

        for (Professor professor : professores) {
            System.out.println(professor);
        }

        return professores;
    }

    public List<Departamento> retornarArquivoDepartamento(String arqDepto) {

        
        String toJsonDepartamento = arq.Read(arqDepto);
        Gson gson = new Gson();
        java.lang.reflect.Type myType = new TypeToken<List<Departamento>>() {
        }.getType();
        List<Departamento> departamentos = gson.fromJson(toJsonDepartamento, myType);

        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }

        return departamentos;
    }
    
    public List<Disciplina> retornarArquivoDisciplina(String arqDisci) {

        
        String toJsonDisciplina = arq.Read(arqDisci);
        Gson gson = new Gson();
        java.lang.reflect.Type myType = new TypeToken<List<Disciplina>>() {
        }.getType();
        
        List<Disciplina> disciplinas = gson.fromJson(toJsonDisciplina, myType);
        

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }

        return disciplinas;
    }








}
