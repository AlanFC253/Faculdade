import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        int x,y,z,primeiraParte,resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os três numeros para sabe qual deles é o maior: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sc.close();

       primeiraParte=(x+y)/2+(Math.abs(x-y))/2;
       resultado=(primeiraParte+z)/2+(Math.abs(primeiraParte-z))/2;
        

        System.out.println("Entrada: x = "+x+" | y = "+y+" | z = "+z);
        System.out.println("Saida:");
        System.out.println("O maior inteiro é: "+resultado);
    }
}