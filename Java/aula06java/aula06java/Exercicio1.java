import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o valor da compra"));
        Conta(valor);
    }

    public static void Conta(double valor) {
        if (valor >= 200) {
            JOptionPane.showMessageDialog(null,
                    "Você tera um desconto de 20% \n Novo valor sera:" + (valor - (valor * 20 / 100)));
        } else {
            JOptionPane.showMessageDialog(null, "Valor não tem desconto.");
        }
    }
}