import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        /* 6- Faça um programa que calcule e mostre a área de um triângulo a partir da leitura da
        base e altura (em cm). Sabe-se que:
        Área = (base * altura)/2. */

        double area,base,altura;
        base=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da base do triangulo em cm: "));

        altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da altura do triangulo em cm: "));
        
        area=(base * altura)/2;

        JOptionPane.showMessageDialog(null, "A Area do triagulo é de: "+area+"cm");
    }
    
}
