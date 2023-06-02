import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        /*4-Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
            salário, sabendo-se que este sofreu um aumento de 25%.*/

        double salario,salarioComAumento;

        salario=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do salario? "));

        salarioComAumento = salario+(salario*25/100);

        JOptionPane.showMessageDialog(null, "Seu salario agora com 25% de aumento é: "+salarioComAumento);

        
    }
}
