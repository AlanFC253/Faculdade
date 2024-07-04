package Exercicio1;


import java.text.DecimalFormat;
import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Random random = new Random();

        float[] list = new float[10];
        DecimalFormat formatter = new DecimalFormat("#.00");

        list = preecherLista(list,random);
        System.out.println("Array Original:");
        for(int i = 0 ; i<=list.length-1;i++){
            System.out.print(formatter.format(list[i])+" | ");
        }
        System.out.println();
        System.out.println("Array Aleatorizado:");
        list=aleatoriza(list,random);
        for(int i = 0 ; i<=list.length-1;i++){
            System.out.print(formatter.format(list[i])+" | ");
        }
    }
    
    public static float[] preecherLista(float[] list, Random random){  
        for(int i = 0;i<10;i++){
            float numeroAleatorio = random.nextFloat();
            numeroAleatorio=numeroAleatorio*100;
            list[i]=numeroAleatorio;
        }
        return list;
    }

    public static float[] aleatoriza(float[] list ,  Random random){

            for (int i = list.length - 1; i > 0; i--) {
              int j = random.nextInt(i + 1);
              float temp = list[i];
              list[i] = list[j];
              list[j] = temp;
            }
           
        return list;
    }
    
    }

        