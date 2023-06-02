import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double numero1=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o primero numero:"));
        String sinal =JOptionPane.showInputDialog(null, "Entre com o sinal da operação que deseja:");
        double numero2=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o segundo numero:"));
        switch (sinal) {
            case "+":              
                JOptionPane.showMessageDialog(null,String.format("%.1f + %.1f = %.1f",numero1,numero2,numero1+numero2));
                break;
            case "-":              
                JOptionPane.showMessageDialog(null,String.format("%.1f - %.1f = %.1f",numero1,numero2,numero1-numero2));
                break;
            case "*":              
                JOptionPane.showMessageDialog(null,String.format("%.1f X %.1f = %.1f",numero1,numero2,numero1*numero2));
                break;
            case "/":
                if (numero2==0) {
                    JOptionPane.showMessageDialog(null, "O segundo valor de uma divisao não pode ser 0");
                }else{
                    JOptionPane.showMessageDialog(null,String.format("%.1f / %.1f = %.1f",numero1,numero2,numero1/numero2));
                }
                break;
            default:
               JOptionPane.showMessageDialog(null, "Sinal invalido");
                break;
        }
    }
    
}