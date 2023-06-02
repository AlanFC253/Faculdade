/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Exercicio2 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores serao lidos? ");
        int n = sc.nextInt();

        for(int i = 0 ; i<=n-1;i++){
            System.out.println("Entre com o "+(i+1)+"º valor: ");
            double aux = sc.nextDouble();
            arr.add(aux);
        }
            
        inverter(arr);

    }
    public static void inverter(ArrayList arr){
        int size = arr.size()-1;
        int n= size;
        ArrayList auxList = new ArrayList();

        for(int i =0; i<=size;i++){
            auxList.add(arr.get(n));
            n--;
        }

        
        System.out.println("Vetor original:");
        for(int i =0 ;i<=size;i++){
            System.out.print(arr.get(i)+"|");
        }
        System.out.println();
        System.out.println("Vetor invertido:");
        for(int i =0 ;i<=size;i++){
            System.out.print(auxList.get(i)+"|");
        }
    }
}