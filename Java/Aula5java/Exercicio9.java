import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double peso, altura,imc;

        peso=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com seu peso:"));
        altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com seu peso:"));
        imc =Imc(peso, altura);
        
        JOptionPane.showMessageDialog(null, String.format("Seu imc e de: %.2f",imc));

    }  public static double Imc(double peso, double altura){
        return peso/(altura*altura);
    } 
}
