package com.mycompany.exercicio1;

import java.util.Scanner;


/**
 *
 *@author Alan ; RGM: 52953004-1
 *
 */
public class Exercicio1 {

             public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre com o a quantidade de valores que serão inseridos : ");

            int n = sc.nextInt();
            double vet[]=new double[n];
            for(int i = 0 ; i<=n-1;i++){
                System.out.println("Entre com o "+(i+1)+"º valor: ");
                vet[i]= sc.nextInt();
            }
            inverter(vet,n);

        }
        
        public static void inverter(double[] vet,int n){
            int size = vet.length-1;
            int aux = size;
            double auxiliar[]=new double[n];

            for(int i = 0; i<=size;i++){
                auxiliar[i]=vet[aux];
                aux--;
            }

            
            System.out.println("Vetor original:");
            for(int i =0 ;i<=size;i++){
                System.out.print(vet[i]+"|");
            }
            System.out.println();
            
            System.out.println("Vetor invertido:");
            for(int i =0 ;i<=size;i++){
                System.out.print(auxiliar[i]+"|");
            }
        }
}