/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1;

/**
 *
 * Alan Fernandes Cavalcante  RGM:529530041
 */

class Exercicio1{
    public static void main(String[] args) {
        String paises[] = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};              

     Bubble_Sort(paises);   
        
    }


    public static void Bubble_Sort(String[] paises) {
        for (int i = 0; i < paises.length - 1; ++i)
		for (int j = i + 1; j < paises.length; ++j)
			if (paises[i].compareTo(paises[j]) > 0) {
				String temp = paises[i];
				paises[i] = paises[j];
				paises[j] = temp;
			}
	
	for (String paise : paises){
		System.out.println(paise);
    }
    }
}
