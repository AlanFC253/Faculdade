import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        double lado1,lado2,resultado;
        lado1=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com primeiro lado do retangulo:"));
        lado2=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o segundo lado do retangulo:"));
        resultado=area(lado1,lado2);
        JOptionPane.showMessageDialog(null, String.format("A area do retangulo é %.2f", resultado), "Area do retangulo", 1);
    }
    public static double area(double lado1,double lado2){
        double conta=lado1*lado2;
        return conta;
    }
}
