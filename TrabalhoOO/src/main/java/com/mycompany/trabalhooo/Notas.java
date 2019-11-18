/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo;

/**
 *
 * @author ice
 */
public class Notas {
    private float tvc1;
    private float tvc2;
    private float tvc3;
    String aprovacao;
    private Aluno a;
    private Turma t;
    
    public Notas(){
        this.tvc1 = 0;
        this.tvc2 = 0;
        this.tvc3 = 0;
    }
    
    public float calcMedia(){
        float media = (this.getTvc1()+this.getTvc2()+this.getTvc3())/3;
        return media;
     }

    /**
     * @return the tvc1
     */
    public float getTvc1() {
        return tvc1;
    }

    /**
     * @param tvc1 the tvc1 to set
     */
    public void setTvc1(float tvc1) {
        this.tvc1 = tvc1;
    }

    /**
     * @return the tvc2
     */
    public float getTvc2() {
        return tvc2;
    }

    /**
     * @param tvc2 the tvc2 to set
     */
    public void setTvc2(float tvc2) {
        this.tvc2 = tvc2;
    }

    /**
     * @return the tvc3
     */
    public float getTvc3() {
        return tvc3;
    }

    /**
     * @param tvc3 the tvc3 to set
     */
    public void setTvc3(float tvc3) {
        this.tvc3 = tvc3;
    }
    
}
