import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args) {
        //1-Crie um programa que solicite ao usuario a sua idade expressa em anos,meses e dias(variasveis separadas).Calcule e mostre a idade empressa apenas em dias. Para isso considere 1 ano = 365 dias, 1 mes=30
        
        int anos,meses,dias,resultado;

        anos=Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos voce tem ? "));

        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos meses ? "));
        
        dias=Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias ? "));

        resultado = (anos*365)+(meses*30)+dias;

        JOptionPane.showMessageDialog(null, "Voce tem "+resultado+" dias");

        
    }
}