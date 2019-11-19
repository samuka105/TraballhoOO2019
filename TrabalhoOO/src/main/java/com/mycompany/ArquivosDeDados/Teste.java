/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArquivosDeDados;

/**
 *
 * @author Enedilson
 */
public class Teste {
    public static void main(String[] args) {
        String arq = "Riso.txt";
      /*  String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        
        if(Arquivo.Write(arq, text)){
            System.out.println("Texto salvo");           
        }
        else{
            System.out.println("Erro!");
        }
        
    }*/
       
        String texto = Arquivo.Read(arq);
        if(texto.isEmpty()){
            System.out.println("Erro ao ler do arquivo.");
        }
        else{
            System.out.println("Texo :" + texto);
        } 
    
    

    }
}  