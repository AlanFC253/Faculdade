import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int quantidadeDe25, quantidadeDe10, quantidadeDe5;

        quantidadeDe25=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a quantidade de notas de 25"));

        quantidadeDe10=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a quantidade de notas de 10"));

        quantidadeDe5=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a quantidade de notas de 5"));

        valorCofre(quantidadeDe25, quantidadeDe10, quantidadeDe5);
    }
    public static double valorCofre(int quantidadeDe25,int quantidadeDe10, int quantidadeDe5) {
        return (quantidadeDe25*0.25)+(quantidadeDe10*0.1)+(quantidadeDe5*0.05);
    }
}
