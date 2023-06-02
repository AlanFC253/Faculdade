import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double valorDoProduto=Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor do produto"));
        double novoValor=valorComDesconto(valorDoProduto);
        JOptionPane.showMessageDialog(null,"O valor com 9% de desconto sera de:"+novoValor);

    }
    public static double valorComDesconto(double valorDoProduto){
        double novoValor = valorDoProduto-(valorDoProduto*9/100);
        return novoValor;
    }
}
