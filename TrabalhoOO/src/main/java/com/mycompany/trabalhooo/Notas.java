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
    float tvc1;
    float tvc2;
    float tvc3;
    String aprovacao;
    
    public Notas(float tvc1, float tvc2, float tvc3){
        this.tvc1 = tvc1;
        this.tvc2 = tvc2;
        this.tvc3 = tvc3;
    }
    
    public float calcMedia(){
        float media = (this.tvc1+this.tvc2+this.tvc3)/3;
        return media;
     }
    
}
