
public class Exercicio1 {
    public static void main(String[] args) {
        int[] qtd = { 10, 15, 8, 13, 7, 2, 23, 4, 17, 7, 9, 20 };
        String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
        MaiorMenor(qtd, meses);
        System.out.println("A media de vendas no periodo foi : " + MediaNoPeriodo(qtd));
        System.out.print("Os meses que foram maior que a media foram: ");
        MaiorQueAMedia(meses,qtd);
        
    }

    public static void MaiorMenor(int[] a, String[] b) {
        int menor = 23;
        int maior = 0;
        String menorMes = "";
        String maiorMes = "";
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] >= maior) {
                maior = a[i];
                menorMes = b[i];
            }
            if (a[i] <= menor) {
                menor = a[i];
                maiorMes = b[i];
            }
        }
        System.out.println("O mes com a maior quantidades de vendas foi: " + maiorMes + " com " + maior + " vendas");
        System.out.println("O mes com o menor quantidades de vendas foi: " + menorMes + " com " + menor + " vendas");
    }

    public static int MediaNoPeriodo(int[] a) {
        int soma = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            soma += a[i];
        }
        int resultado = soma / a.length;
        return resultado;
    }

    public static void MaiorQueAMedia( String[] a,int[]b) {
        int media=MediaNoPeriodo(b);       
        for(int i=0;i<=a.length-1;i++){
            if(b[i]>=media){
            System.out.print(a[i]+" ");
            }
        }
    }

}
