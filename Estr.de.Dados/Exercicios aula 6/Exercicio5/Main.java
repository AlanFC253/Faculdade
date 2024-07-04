package Exercicio5;

public class Main {
    
    public static void main(String[] args) {
        OrdenacaoQuickSort();
    }
    
    public static void OrdenacaoQuickSort() { 
        double vet[] = {5, 3, 9, 4, 1, 2, 8, 7, 6};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        quickSort(vet, 0, vet.length-1); 
        
        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }
    
    public static boolean quickSort(double[] vetor, int inicio, int fim) {
        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar(vetor, inicio, fim);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }
    
   private static int separar(double[] vetor, int inicio, int fim) {
      double pivo = vetor[inicio];
      int i = inicio + 1, f = fim; 
      while (i <= f) {
         if (vetor[i] <= pivo)
            i++;
         else if (pivo < vetor[f])
            f--;
         else {  //troca vetor[i] com vetor[f]
            double troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }    
    
    public static void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println("\n");
    }

}


    

