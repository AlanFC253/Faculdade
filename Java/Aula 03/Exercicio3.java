import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args) {
        /*3- Escreva um programa para calcular o valor de uma prestação em atraso (prestacao).
        Para isso, obtenha o valor da prestação (valorPrestacao), a porcentagem de multa pelo
        atraso (multa) e a quantidade de dias de atraso (qtdeDias). Calcular e mostrar o valor
        da prestação atualizado, sabendo que:
        prestacao = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)*/

        double prestacao,valorPrestacao,multa,quantidadeDeDias;

        valorPrestacao=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da prestação"));

        multa=Double.parseDouble(JOptionPane.showInputDialog(null, "Agora entre com a porcentagem da muta por cada dia passado: "));

        quantidadeDeDias=Double.parseDouble(JOptionPane.showInputDialog(null,"Por ultimo,entre com a quantidade de dias passados: "));
        
        prestacao=valorPrestacao+(valorPrestacao*(multa/100)*quantidadeDeDias);


        JOptionPane.showMessageDialog(null, "O valor a se paga sera de : R$"+prestacao);
    }
}