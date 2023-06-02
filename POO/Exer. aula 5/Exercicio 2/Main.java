// Aluno: Alan Fernandes Cavalcante
// RGM: 529530041

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Triangulo t1= new Triangulo(30,25);

    Triangulo t2 = new Triangulo();
    System.out.println("Qual a base do t2? ");
    double base = sc.nextDouble();
    System.out.println("Qual a altura do t2? ");
    double altura = sc.nextDouble(); 
    t2.setBase(base);
    t2.setAltura(altura);
    

    t1.imprimirDados();
    t2.imprimirDados();

    sc.close();
    }
}
