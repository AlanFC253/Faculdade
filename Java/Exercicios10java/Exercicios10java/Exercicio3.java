import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantos numeros serão inseridos? ");
        int vetor[]=new int[sc.nextInt()];
        int soma=0;
        int vetor2[]=new int[vetor.length];
        int quantidade=0;
        for(int i=0;i<=vetor.length-1;i++){
            System.out.print("Entre com o "+(i+1)+"º valor:");
            vetor[i]=sc.nextInt();
            soma+=vetor[i];
        }
        int media = soma/vetor.length;
        for(int i =0;i<=vetor.length-1;i++){
            if(vetor[i]>=media){
                quantidade++;
                vetor2[i]=vetor[i];
            }
        }

        System.out.println("A media dos numeros inseridos é: "+media);
        System.out.println("A quantidade de numeros inseridos a cima da media é: "+quantidade);
        System.out.print("Os numeros acima da media sao: ");
        for(int i=0;i>=vetor2.length;i++){
            System.out.print(vetor2[i]+" ");
        }
        sc.close();
        }
    }

