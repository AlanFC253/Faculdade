import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um numero: "));
        Adivinha(numero);
    }

    public static void Adivinha(int numero) {
        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, "Valor correto.");
        } else {
            JOptionPane.showMessageDialog(null, "Valor incorreto.");
        }
    }
}