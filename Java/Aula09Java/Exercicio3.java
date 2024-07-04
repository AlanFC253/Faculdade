import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        String palavra=JOptionPane.showInputDialog(null,"Entre com uma palavra para saber se ela é um palíndromo ou não:");
        String palavraInversa= new StringBuilder(palavra).reverse().toString();

        if(palavra.equals(palavraInversa)){
            JOptionPane.showMessageDialog(null,"A palavra é um palíndromo");
        }else{
            JOptionPane.showMessageDialog(null,"A palavra não é um palíndromo");
        }
    }
}
