package Exercicio1;

import java.util.Scanner;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura,base,raio;

        System.out.println("Entre com a altura:");
        altura=sc.nextDouble();

        System.out.println("Entre com a base:");
        base=sc.nextDouble();

        System.out.println("Entre com o raio:");
        raio=sc.nextDouble();

        Circunferencia c1 = new Circunferencia(raio);
        c1.mostrar();

        Retangulo r1 = new Retangulo(base, altura);
        r1.mostrar();

        sc.close();
    }
}