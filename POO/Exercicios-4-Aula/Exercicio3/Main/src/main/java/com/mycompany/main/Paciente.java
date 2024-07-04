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
public class Paciente {
    public String nome=null,rg,endereco,telefone,profissao;
    public int anoNascimento;

    int anoAtual=2023;

    public Paciente(){
        
    }
    
    public Paciente(String n){
        this.nome=n;
    }
    
    public void Cadastrar_dados(){
        
        Scanner sc= new Scanner(System.in);
        
        if(this.nome==null){
            System.out.println();

            System.out.println("Entre com o nome do Paciente:");
            this.nome=sc.nextLine();

            System.out.println("Entre com o Rg do Paciente:");
            this.rg=sc.nextLine();

            System.out.println("Entre com o endereço do Paciente:");
            this.endereco=sc.nextLine();

            System.out.println("Entre com o telefone do Paciente:");
            this.telefone=sc.nextLine();

            System.out.println("Entre com o ano de nascimento do Paciente:");
            this.anoNascimento=sc.nextInt();

            System.out.println("Entre com a profissao do Paciente:");
            this.nome=sc.nextLine();

            System.out.println();
        
        }else{
            
            System.out.println("Entre com o Rg do Paciente:");
            this.rg=sc.nextLine();

            System.out.println("Entre com o endereço do Paciente:");
            this.endereco=sc.nextLine();

            System.out.println("Entre com o telefone do Paciente:");
            this.telefone=sc.nextLine();

            System.out.println("Entre com o ano de nascimento do Paciente:");
            this.anoNascimento=sc.nextInt();

            System.out.println("Entre com a profissao do Paciente:");
            this.nome=sc.nextLine();

            System.out.println();
        }
        
        sc.close();
    }
     
    public void Imprimir_dados(){
        System.out.println();
        
        System.out.println("Nome do Paciente: "+this.nome);
        
        System.out.println("RG do Paciente: "+this.rg);
        
        System.out.println("Endereço do Paciente: "+this.endereco);
        
        System.out.println("Telefone do Paciente: "+this.telefone);
        
        System.out.println("Ano de nascimento do Paciente: "+this.anoNascimento);
        
        System.out.println("Idade do Paciente: "+Calcular_idade(anoAtual));
        
        System.out.println("Profissão do Paciente:"+this.profissao);
    }
    
    public int Calcular_idade(int anoAtual){
        int idadeDoPaciente = this.anoNascimento-anoAtual;
        return idadeDoPaciente;
    }
}
