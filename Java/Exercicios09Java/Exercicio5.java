import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        validaPlaca();

    }

    public static void validaPlaca() {
        try {
            String placa = JOptionPane.showInputDialog(null, "Entre com a sua placar no formato: LLNNNN");
        if (placa.length() == 6) {
            if (placa.substring(0, 1).matches("[A-Z]*") || placa.substring(0, 1).matches("[a-z]*")) {
                if(placa.substring(2).matches("[0-9]*")){
                    if (placa.substring(placa.length() - 1).equals("1")
                        || placa.substring(placa.length() - 1).equals("2")) {
                    JOptionPane.showMessageDialog(null, "Rodízio na segunda-feira");
                } else if (placa.substring(placa.length() - 1).equals("3")
                        || placa.substring(placa.length() - 1).equals("4")) {
                    JOptionPane.showMessageDialog(null, "Rodízio na terça-feira");
                } else if (placa.substring(placa.length() - 1).equals("5")
                        || placa.substring(placa.length() - 1).equals("6")) {
                    JOptionPane.showMessageDialog(null, "Rodízio na quarta-feira");
                } else if (placa.substring(placa.length() - 1).equals("7")
                        || placa.substring(placa.length() - 1).equals("8")) {
                    JOptionPane.showMessageDialog(null, "Rodízio na quinta-feira");
                } else if (placa.substring(placa.length() - 1).equals("9")
                        || placa.substring(placa.length() - 1).equals("0")) {
                    JOptionPane.showMessageDialog(null, "Rodízio na sexta-feira");
                } else {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Os ultimos 4 caracteres devem se numeros");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os primeiros 2 caracteres devem se letras validas");
                }
                
        }else{
            JOptionPane.showMessageDialog(null, "Quantidade de caracteres invalidas");
        }

        String continuar = JOptionPane.showInputDialog(null, "deseja verificar outra placa?\nS = Sim   N=não");

        if(continuar.equalsIgnoreCase("S")){
            validaPlaca();
        }else if (continuar.equalsIgnoreCase("N")) {
            JOptionPane.showMessageDialog(null, ":D");
        }else{
            JOptionPane.showMessageDialog(null, "Invalido");
        }
    
        } catch (IndexOutOfBoundsException  e) {
            JOptionPane.showMessageDialog(null, "Não aceito numero negativo");
        }
        }
}