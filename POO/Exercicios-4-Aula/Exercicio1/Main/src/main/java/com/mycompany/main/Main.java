/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/*
  *
  * @Alan Fernandes Cavalcante 
  * RGM:529530041
  * 
  */
  
 public class Main {
 
     public static void main(String[] args) {
         
         // Classe Triangulo testes:
         
         Triangulo t1 = new Triangulo();
         t1.altura=30;
         t1.base=60;
         Triangulo t2 = new Triangulo(25,50 );
         
         System.out.println(t1.Calcular_area());
         System.out.println(t2.Calcular_area());
         
         t1.imprime_dados();
         t2.imprime_dados();
         
         //Classe Data teste:
         
         Data d1 = new Data();
         Data d2 = new Data(17,02,1998);
         d1.Cadastra_dados();
         
         d1.Imprimir_data();
         d2.Imprimir_data();
         
     }
 }
 