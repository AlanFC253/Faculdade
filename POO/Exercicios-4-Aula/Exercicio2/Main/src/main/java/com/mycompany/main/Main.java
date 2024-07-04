/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @Alan Fernandes Cavalcante 
 * RGM:529530041
 * 
 */
public class Main {

    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.Cadastra_curso();
        Curso c2 = new Curso("Ciencia da Computação",43,"3ºa",600);
        c1.Imprimir_dados();
        c2.Imprimir_dados();
    }
}
