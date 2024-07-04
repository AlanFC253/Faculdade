/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

/**
 *
 * Alan Fernandes Cavalcante  RGM:529530041
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int numeros [] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};


        Selection_Sort(numeros);
    }

    public static void Selection_Sort(int[] numeros) {
        
        for (int i = 0; i < numeros.length - 1; i++) {

            int min = i;

            for (int j = i+1; j < numeros.length; j++) {
                if ( numeros[j] > numeros[min] ) 
                    min = j;
                }
            
            int aux = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = aux;
        }

        for(int i : numeros){
            System.out.println(i);
        }

  }
}

