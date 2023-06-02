import java.util.*;

public class Exercicio4 {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        double x1,y1,x2,y2;
        System.out.println("Entre com os 4 numeros reais correspondentes as coordenadas x e y");

        System.out.println("Entre com o x1: ");
        x1 = sc.nextDouble();

        System.out.println("Entre com o y1: ");
        y1 = sc.nextDouble();

        System.out.println("Entre com o x2: ");
        x2 = sc.nextDouble();

        System.out.println("Entre com o y2: ");
        y2 = sc.nextDouble();


        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("Entradas: p1(%.2f , %.2f) e p2(%.2f , %.2f)",x1,y1,x2,y2);
        System.out.println("\nSaida");
        System.out.printf("A distancia entre os pontos é %.4f",distancia);

        sc.close();

    }

}