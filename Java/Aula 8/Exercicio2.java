import javax.swing.JOptionPane;

public class Exercicio2{
    public static void main(String[] args) {
        //2-Escreva um programa em Java que solicite ao usuário o salário atual e mostre o salário acrescido de 5% de comissão.

        double salarioBase= Double.parseDouble(JOptionPane.showInputDialog(null, "Qual seu salario: "));

        double salarioComComissao = salarioBase+(salarioBase/0.05);

        JOptionPane.showMessageDialog(null, "Seu salario com bonificação fica:"+salarioComComissao);
    }
}
