import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        int valor;
        int entrada;
        int notas100;
        int notas50;
        int notas10;
        int notas5;
        int notas1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe um valor");
        valor=sc.nextInt();
        entrada=valor;

        notas100 = valor / 100;  
        valor = valor - (notas100 * 100);
 
        notas50 = valor / 50;  
        valor = valor - (notas50 * 50);
 
        notas10 = valor / 10;  
        valor = valor - (notas10 * 10);
 
        notas5 = valor / 5;  
        valor = valor - (notas5 * 5);
 
        notas1 = valor;
        
        System.out.println("Entrada:"+entrada);
        System.out.println("Saida:");
        System.out.println(notas100+" notas de R$ 100");
        System.out.println(notas50+" notas de R$ 50");
        System.out.println(notas10+" notas de R$ 10");
        System.out.println(notas5+" notas de R$ 5");
        System.out.println(notas1+" notas de R$ 1");
        sc.close();
    }
    }
