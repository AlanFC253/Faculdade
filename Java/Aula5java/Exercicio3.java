import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double valorDaCompra,quantidadeDeParcelas,valorDaParcela;
        valorDaCompra=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da compra?"));
        quantidadeDeParcelas=Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é a quantidade de parcelas?"));
        valorDaParcela=conta(valorDaCompra,quantidadeDeParcelas);
        JOptionPane.showMessageDialog(null, String.format("O valor da parcela sera de: %.2f",valorDaParcela), "Resultado", 1);

    }
    public static double conta(double valorDaCompra,double  quantidadeDeParcelas){
        double resultado=((valorDaCompra*5/100)+valorDaCompra)/quantidadeDeParcelas;
        return resultado;
    }
}
