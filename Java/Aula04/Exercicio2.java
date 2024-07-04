import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        int a,b,c,d,diferença;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os 4 numeros: ");

        System.out.print("");
        a=sc.nextInt();

        System.out.print("");
        b=sc.nextInt();

        System.out.print("");
        c=sc.nextInt();

        System.out.print("");
        d=sc.nextInt();

        diferença=(a*b)-(c*d);

        System.out.printf("Entrada: a= %d b= %d c= %d d= %d",a,b,c,d);
        System.out.println("");
        System.out.println("Saída:");
        System.out.printf("diferença = %d",diferença);

        sc.close();
    }
}