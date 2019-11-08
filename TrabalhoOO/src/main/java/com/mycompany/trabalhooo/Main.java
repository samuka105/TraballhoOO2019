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
public class Main {
    public static void main(String[] args) {
        Aluno novo = new Aluno("Ronan", 20, "ronansr@live.com", "1111111111", "2017");
        novo.setLogin("ronan123", "123");
        novo.imprimeAluno();
    }
}
