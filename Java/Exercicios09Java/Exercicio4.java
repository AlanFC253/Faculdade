import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        double valorProduto;
        try {
            valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do produto"));
            if (valorProduto >= 200) {
                JOptionPane.showMessageDialog(null,
                        "O valor da compra sera:" + (valorProduto - (valorProduto * 20 / 100)));
            } else {
                JOptionPane.showMessageDialog(null, "Valor sem desconto", null, 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro , digite um valor valido numerico");

        } finally {
            JOptionPane.showMessageDialog(null, "Fim do programa");
        }
    }
}
