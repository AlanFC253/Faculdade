import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        Object[] options = { "N", "D" };
        double turno = JOptionPane.showOptionDialog(null, "Qual seu Turno?", "Turno", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[1]);

        double quantidadeDeHoras = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual quantidade de horas:"));

        JOptionPane.showMessageDialog(null, "Seu salario sera de:" + Salario(turno, quantidadeDeHoras));
    }

    public static double Salario(double turno, double quantidadeDeHoras) {
        if (turno == 0) {
            double salario = quantidadeDeHoras * 40;
            return salario;
        } else {
            double salario = quantidadeDeHoras * 37.5;
            return salario;
        }
    }

}
