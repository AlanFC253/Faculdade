import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double real,dolar,resultado;

        real=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor em reais que voce quer converte em dola:"));
        dolar=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor do dolar"));
        resultado=converteDolar(real, dolar);
        JOptionPane.showMessageDialog(null, String.format("O valor em dolar sera de %.2f",resultado));

    } public static double converteDolar(double real, double dolar) {
        return real/dolar;
    }
}
