package exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        int quantidadeQuadrados,quantidadeTelheiro;
        double soma,bonificacao;

        quantidadeQuadrados=Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade de pregos Quadrados vendidos?"));
        quantidadeTelheiro=Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade de pregos Telheiros vendidos?"));

        Quadrado quadrado=new Quadrado(quantidadeQuadrados);
        Telheiro telheiro=new Telheiro(quantidadeTelheiro);
        soma=quadrado.getArrecadado()+telheiro.getArrecadado();
        bonificacao=(quadrado.getArrecadado()+telheiro.getArrecadado())*10/100;

        JOptionPane.showMessageDialog(null, "O total arrecadado por Pregos Telheiro é de:"+telheiro.getArrecadado());

        JOptionPane.showMessageDialog(null, "O total arrecadado por Pregos Telheiro é de:"+quadrado.getArrecadado());

        JOptionPane.showMessageDialog(null, "A quantia geral de Pregos Quadrados e Telheiro  vendidos é de:"+soma);

        JOptionPane.showMessageDialog(null, "O total arrecadado por Pregos Telheiro e Quadrado é de:"+bonificacao);
    }
}
