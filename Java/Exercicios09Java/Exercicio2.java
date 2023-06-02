import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog(null, "Entre com uma frase:");
        frase=new StringBuilder(frase).reverse().toString();
        JOptionPane.showMessageDialog(null, frase);
    }
}
