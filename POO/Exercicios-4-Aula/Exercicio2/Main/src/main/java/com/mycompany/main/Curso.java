/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @Alan Fernandes Cavalcante 
 * RGM:529530041
 * 
 */
public class Curso {
    public String nome;
    public int quantidadeDeAlunos;
    public String turma;
    public float mensalidade;
    
    public Curso(){
        
    }
    
    public Curso(String n, int q , String t,float m){
        this.nome=n;
        this.quantidadeDeAlunos = q;
        this.turma=t;
        this.mensalidade=m;
    }
    
    public void Cadastra_curso(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println();
        
        System.out.println("Qual sera o Curso:");
        this.nome= sc.nextLine();
        
        System.out.println("Qual a quantidade de alunos:");
        this.quantidadeDeAlunos= sc.nextInt();
        
        System.out.println("Qual a Turma:");
        this.turma= sc.nextLine();
        
        System.out.println("Qual a mensalidade do Curso:");
        this.mensalidade= sc.nextFloat();
        
        System.out.println();
    }
    
    
    public void Imprimir_dados(){
        System.err.println();
        System.out.println("Nome do curso: "+ this.nome);
        System.out.println("Quantidade de alunos: "+ this.quantidadeDeAlunos);
        System.out.println("Turma:  "+ this.turma);
        System.out.println("Valor da mensalidade: "+ this.mensalidade);
        System.out.println("Valor total da mensalidade de 1 ano: "+Calcular_total_mensalidade());
        System.err.println();
        
    }
    
    public float Calcular_total_mensalidade(){
        float total = this.mensalidade*12;
        return total;
    }
    
}
