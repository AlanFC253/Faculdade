import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        String nome;
        double salario,vendas,comissao ,salarioComComissao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        nome=sc.nextLine();

        System.out.println("Entre com seu salario:");
        salario=sc.nextDouble();

        System.out.println("Entre com o total de vendas:");
        vendas=sc.nextDouble();

        System.out.println("");
        comissao=vendas*0.05;


        salarioComComissao=salario+comissao;

        System.out.println("Entrada: nome = "+nome+" | salario= "+salario+"| vendas= "+vendas);
        System.out.println("Saida");
        System.out.printf("%s deve receber R$ %.2f",nome,salarioComComissao);

        sc.close();
    }
}