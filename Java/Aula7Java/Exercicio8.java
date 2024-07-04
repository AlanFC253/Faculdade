import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int destino = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Entre com o codigo de seu destino:\n1- Região Norte \n2-Região Nordeste \n3-Região Centro-Oeste \n4-Região Sul"));
        if (destino > 4 || destino <= 0) {
            JOptionPane.showMessageDialog(null, "Codigo de viagem invalido");
        } else {
            int meio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Agora informe se sera somente ida ou ida e volta\n1-Somente ida \n2-Ida e volta"));
            if (meio == 1 || meio == 2) {
                switch (destino) {
                    case 1:
                        if (meio == 1) {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$500");
                        } else {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$900");
                        }
                        break;
                    case 2:
                        if (meio == 1) {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$350");
                        } else {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$650");
                        }
                        break;
                    case 3:
                        if (meio == 1) {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$350");
                        } else {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$600");
                        }
                        break;
                    case 4:
                        if (meio == 1) {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$600");
                        } else {
                            JOptionPane.showMessageDialog(null, "O valor da passagem sera de: R$550");
                        }
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de viagem invalido");
            }
        }
    }
}
