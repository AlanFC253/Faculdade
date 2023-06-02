package Exercicio3;

public class Main {
    public static void main(String[] args) {

        String[] paisesA = { "Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha",
                "Chile", "Brasil", "Argentina" };
        String[] paisesB = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França",
                "Inglaterra", "Turquia", "Uruguai" };
        String[] paisesC = { "Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia",
                "Angola", "Moçambique", "Rússia" };

        System.out.println(buscaSequencial(paisesA,"México"));
        System.out.println(buscaBinariaEmListaCrescente(paisesB,"Chile"));
        System.out.println(buscaBinariaEmListaDecrescente(paisesC,"Portugal"));

    }

    public  static  int buscaSequencial(String vet[], String buscado) {

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equals(buscado)) {
                return i;
            }
        }
        return -1; // retorna -1 se não encontrar
    }

    public  static int buscaBinariaEmListaCrescente(String vet[], String buscado) {
        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = buscado.compareTo(vet[meio]);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // retorna -1 se não encontrar
    }

    public static int buscaBinariaEmListaDecrescente(String vet[], String buscado) {
        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = buscado.compareTo(vet[meio]);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao > 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // retorna -1 se não encontrar}

    }
}
