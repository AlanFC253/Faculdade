import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args) {
        //1-Desenvolva um programa em Java que solicite ao usuário os valores dos lados de um retângulo e calcule e mostre seu perímetro e sua área.

        double altura= Double.parseDouble(JOptionPane.showInputDialog(null, "Qul a largura do triangulo?"));

        double base =Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a base do triangulo?"));

        double area = base*altura/2;

        JOptionPane.showMessageDialog(null,"A area do triangulo é: "+area, "Triangulo", 2);
    }
}