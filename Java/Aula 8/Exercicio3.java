import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args) {
        //3-Escreva um programa em Java que solicite ao usuário a distância entre duas cidades eo tempo de viagem.O programa deverá calcular e exibir a velocidade média de um carro que vai de uma cidade para outra.Utilize a fórmula:

        double distancia = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a distancia: "));

        double tempo = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a distancia: "));

        double velocidadeMedia= distancia/tempo;

        JOptionPane.showInputDialog(null, "A velocidade media do carro devera ser de:"+velocidadeMedia);
    }
}