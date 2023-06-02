import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        int numero1,numero2,produto;
        Scanner sc=new Scanner(System.in);

        System.out.println("Entrada:");
        System.out.print("");
        numero1=sc.nextInt();
        System.out.print("");
        numero2=sc.nextInt();
        System.out.println("Saída:");
        produto=numero1*numero2;
        System.out.print("produto = "+produto);

        sc.close();
    }
}