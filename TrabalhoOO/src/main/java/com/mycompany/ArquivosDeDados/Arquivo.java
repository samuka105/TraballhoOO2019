/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArquivosDeDados;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Enedilson
 */
public class Arquivo {
    
    /**
     *
     */
    public static  String caminho = "Arquivos/DadosUniversitarios";
    public static String Read(String caminho){
       String conteudo = "";
       try{
           FileReader arq = new FileReader(caminho);
           BufferedReader lerArq = new BufferedReader(arq);
           String linha="";
           try{
               linha = lerArq.readLine();
               while(linha != null){
                   conteudo += linha;
                   linha = lerArq.readLine();
               }
               arq.close();
           } catch (IOException ex){
               conteudo = "Erro: Não foi possível ler o arquivo!";
           }
           
           }catch(FileNotFoundException ex){
               conteudo = "Erro: Arquivo não encontrado!";
           }
           if(conteudo.contains("Erro"))
               return "";
           else{
               return conteudo;
        }

}


public static boolean Write(String caminho, String Text){
    try{
        FileWriter arq = new FileWriter(caminho);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println(Text);
        gravarArq.close();
        return true;
    } catch(IOException e){
        System.out.println(e.getMessage());
        return false;
    }
 }

}