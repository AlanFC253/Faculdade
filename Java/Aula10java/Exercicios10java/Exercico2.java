import java.util.Scanner;

public class Exercico2 {
    public static void main(String[] args) {
        int vetor[]=new int[10];
        int maiorValor=0;
        int soma=0;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<=vetor.length-1;i++){
            System.out.println("Entre com o "+(i+1)+"º valor:");
            vetor[i]=sc.nextInt();
            soma+=vetor[i];
            if(vetor[i]>=maiorValor){
                maiorValor=vetor[i];
            }
        }

        System.out.println("A divisão de todos os valores pelo maior valor foi de : "+soma/maiorValor);
        System.out.println("os numeros digitados fora:");
        for(int i=0;i<=vetor.length-1;i++){
            System.out.print(vetor[i]+" ");
        }
        sc.close();
    }
}
