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
        
       Paciente p1 = new Paciente();
       Paciente p2 = new Paciente("Alan");
       
       p1.Cadastrar_dados();
       p2.Cadastrar_dados();
       
       p1.Imprimir_dados();
       p2.Imprimir_dados();
       
    }
}
