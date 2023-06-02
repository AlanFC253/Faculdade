/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @Alan Fernandes Cavalcante 
 * RGM:529530041
 * 
 */
public class Triangulo {
    public float base;
    public float altura;
    
    public Triangulo(){
        
    }
    
    public Triangulo(float b, float a){
        this.altura=a;
        this.base=b;
    }
    
    public float Calcular_area(){
        float area = (this.base*this.altura)/2;
        return area;
    }
    
    public void imprime_dados(){
        System.out.println();
        System.out.println("Base desse triangulo: "+this.base);
        System.out.println("Altura desse triangulo: "+this.altura);
        System.out.println("Area desse triangulo: "+ Calcular_area());
        System.out.println();
    }
    
}
