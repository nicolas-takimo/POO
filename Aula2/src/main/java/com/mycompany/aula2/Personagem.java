/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author nicolas
 */
public class Personagem {
    String nome;
    char genero;
    String universo;
    char papel;
    
    Personagem(String nome, char genero, String universo, char papel){
        this.nome = nome;
        this.genero = genero;
        this.universo = universo;
        this.papel = papel;
                
    }
    void imprimir(){
        System.out.println("=====FICHA======");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Universo: " + this.universo);
        System.out.println("Papel: " + this.papel);
    }
    void imprimirNome(){
        System.out.println(this.nome);
    }
}
