// Aluno: Alan Fernandes Cavalcante
// RGM: 529530041

public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario(12354,1500,"Tecnico de ti");

        System.out.println("O cargo de f1 é: "+f1.cargo);
        System.out.println("O cargo de f2 é: "+f2.cargo);
        System.out.println();
        System.out.println("Aumento do salario por porcentagem do f2 é :" + f2.calculaAumento(10.0f));
        System.out.println("Aumento do salario por tempo do f2 é :" + f2.calculaAumento(10));
    }
}