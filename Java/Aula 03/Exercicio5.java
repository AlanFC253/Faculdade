import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
         /* 5- Faça um programa que receba o salário base de um funcionário, calcule e mostre o
         salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
         base e paga imposto de 7% também sobre o salário base. */

         double salarioBase,salarioArecebe,salarioComGratificação;

         salarioBase=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o seu salario base: "));
         
         salarioComGratificação=salarioBase+(salarioBase*5/100);

         salarioArecebe=salarioComGratificação-(salarioComGratificação*7/100);

         JOptionPane.showMessageDialog(null,salarioArecebe);
    }
}
