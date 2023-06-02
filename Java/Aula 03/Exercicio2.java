import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
       // 2- Faça um programa que receba três notas, calcule e mostre a média aritmética.

       double nota1,nota2,nota3,resultado;

       nota1=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a primeira nota: "));

       nota2=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a segunda nota: "));

       nota3=Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a terceira nota: "));
       
       resultado=(nota1+nota2+nota3)/3;

       JOptionPane.showMessageDialog(null, "A nota aritmetica das 3 notas é: "+resultado);

    }
}
