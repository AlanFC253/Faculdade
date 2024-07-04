package Exercicio2;

import java.util.Scanner;

// Alan Fernandes Cavalcante
// Rgm:52953004-1


public class Main {
    public static void main(String[] args) {
        String nomeA,matriculaA,nomeP,matriculaP;
        float qtDehoras,valorHora;
        
        Scanner sc= new Scanner(System.in);
        
        //analista
        System.out.println("Digite o nome do Analista: ");
        nomeA=sc.nextLine();

        System.out.println("Digite a matricula do Analista: ");
        matriculaA=sc.nextLine();

        int qtDeProj;
        System.out.println("Quantos progetos o Analista fez?");
        qtDeProj=sc.nextInt();

        float[] vP= new float[qtDeProj];
        for(int i = 0;i<vP.length;i++){
            System.out.println("Entre com o valo do "+(i+1)+"º projeto");
            vP[i]=sc.nextFloat();
        }

        Analista a1 = new Analista(nomeA,matriculaA,vP);
        
        //Programador

        System.out.println("Digite o nome do programador: ");
        nomeP=sc.nextLine();

        System.out.println("Digite a matricula do programdor: ");
        matriculaP=sc.nextLine();

        System.out.println("Digite a quantidade de horas  do programador: ");
        qtDehoras=sc.nextFloat();

        System.out.println("Digite o valor por horas do programador: ");
        valorHora=sc.nextFloat();

        Programador p1 = new Programador(nomeP, matriculaP, qtDehoras, valorHora);


        //Mostrar os dois
        a1.mostrar();
        p1.mostrar();

        sc.close();

    }
}
