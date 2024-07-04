package Exercicio07.Exercicio2;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class TestFuncionario {
    public static void main(String[] args) {
        Gerente g1= new Gerente(1243,5);
        g1.setSalario(35000);
        Funcionario c1 = new Caixa();
        c1.setSalario(1515);

        g1.autentica();
        System.out.println(g1.getSalario());
        System.out.println("Bonificação desse Funcionario sera:"+g1.bonificacao());
        c1.autentica();
        System.out.println("Bonificação desse Funcionario sera:"+c1.bonificacao());
    }
}
