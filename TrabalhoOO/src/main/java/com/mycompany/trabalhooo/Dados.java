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
import java.util.HashMap;
import java.util.List; 

/**
 *
 * @author Enedilson
 */
public class Dados {
    public static List<Aluno> alunos = new ArrayList<>();
    public static List<Professor> professores = new ArrayList<>();
    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Departamento> departamentos = new ArrayList<>();
    public static HashMap<String, char[]> logins = new HashMap<>();
    public static int cont;
    
    public static Arquivo arq;
    
    //MÉTODOS DE SALVAMENTO
    
    public static void salvaAlunos(List<Aluno> alunos){
         Gson gsonAluno = new Gson();
                String toJsonAluno = gsonAluno.toJson(alunos);
                System.out.println("toJson = " + toJsonAluno);
                if(arq.Write(Constantes.ARQUIVO_ALUNOS, toJsonAluno)){    
                    System.out.println("Texto salvo");
                }
                else{
                    System.out.println("Erro!");
                }
    }
    
    public static void salvaProfessores(List<Professor> professores){
          Gson gsonProfessor = new Gson();
         
            String toJsonProfessor = gsonProfessor.toJson(professores);
            
            System.out.println("toJson = " + toJsonProfessor);
            if(arq.Write(Constantes.ARQUIVO_PROFESSORES, toJsonProfessor)){    
                System.out.println("Texto salvo");
            }
             else{
            System.out.println("Erro!");
            } 
    }
    
    public static void salvaDisciplinas(List<Disciplina> disciplinas){
         Gson gson = new Gson();
        String toJsonDisciplina  = gson.toJson(disciplinas);
                System.out.println("toJson = " + toJsonDisciplina);
                if(arq.Write(Constantes.ARQUIVO_DISCIPLINAS, toJsonDisciplina)){    
                    System.out.println("Texto salvo");
                }
                else{
                    System.out.println("Erro!");
                }
    
    }
    
    public static void salvaDepartamentos(List<Departamento> departamentos){
          Gson gson = new Gson();
          String toJsonDepartamento  = gson.toJson(departamentos);
          System.out.println("toJson = " + toJsonDepartamento);
          if(arq.Write(Constantes.ARQUIVO_DEPARTAMENTO, toJsonDepartamento)){    
                System.out.println("Texto salvo");
           }
          else{
                System.out.println("Erro!");
          }
    }
    
    public static void salvaLogins(HashMap<String,char []> logins){
        Gson gsonLogins = new Gson();
        String toJsonLogins = gsonLogins.toJson(logins);
        System.out.println("toJson = " + toJsonLogins);
        if(arq.Write(Constantes.ARQUIVO_LOGINS, toJsonLogins)){    
                System.out.println("Texto salvo");
            }
             else{
            System.out.println("Erro!");
            } 
        
    }
    
       public static void salvaCont(int cont){
        Gson gsonCont = new Gson();
        String toJsonCont = gsonCont.toJson(cont);
        System.out.println("toJson = " + toJsonCont);
        if(arq.Write(Constantes.ARQUIVO_CONTADOR, toJsonCont)){    
                System.out.println("Texto salvo");
            }
             else{
            System.out.println("Erro!");
            } 
        
    }
    
    //MÉTODOS DE LEITURA
    public static List<Aluno> retornarArquivoAlunos(String arqAluno) {

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

    public static List<Professor> retornarArquivoProfessor(String arqProf) {

        
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

    public static List<Departamento> retornarArquivoDepartamento(String arqDepto) {

        
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
    
    public static List<Disciplina> retornarArquivoDisciplina(String arqDisci) {

        
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

//GABRIEL
    public static int retornarArquivoContador(String arqCont) {

        
        String toJsonCont = arq.Read(arqCont);
        Gson gson = new Gson();
        java.lang.reflect.Type myType = new TypeToken<List<int>>() {
        }.getType();
        
        List<int> conts = gson.fromJson(toJsonCont, myType); 
        

        for (Cont cont : conts) {
            System.out.println(cont);
        }

        return cont;
    }







}
