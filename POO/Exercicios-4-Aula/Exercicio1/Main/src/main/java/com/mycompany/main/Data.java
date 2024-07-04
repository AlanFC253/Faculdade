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
import java.util.Scanner;

public class Data {
    public int dia;
    public int mes;
    public int ano;
    
    public Data(){
        
    }
    
    public Data(int d, int m, int a){
        this.dia=d;
        this.mes=m;
        this.ano=a;
    }
    
    public  void Cadastra_dados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o dia:");
        this.dia= sc.nextInt();
        System.out.println("Entre com o mes:");
        this.mes= sc.nextInt();
        System.out.println("Entre com o ano:");
        this.ano= sc.nextInt();
        sc.close();
    } 
    
    public void Imprimir_data(){
        System.out.println(this.dia+" / "+this.mes+" / "+this.ano);
      }
    
}