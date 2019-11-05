package com.mycompany.trabalhooo;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Geral
 */
public class Disciplina {
    // tem turmas, professores, alunos, notas, departamento
    //ronan: acredito que os atributos alunos e notas devam estar em turma
    private String nome;
    private int cargaHoraria;
    private String codigo; //seria necessário?
    private Departamento departamento;
    
    //lista de todas as turmas
    List<Turma> turmas = new ArrayList<>();
    
}
