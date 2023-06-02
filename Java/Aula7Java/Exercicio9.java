import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {

        String tipoDeDiaria = JOptionPane.showInputDialog(null,
                "Por favor digite o tipo hospedagem desejada: \nS-Simples\nD-Duplo\nT-triplo");

        if(tipoDeDiaria.equals("S") || tipoDeDiaria.equals("D") || tipoDeDiaria.equals("T")){
            double quantidadeDeDiarias = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantas diarias deseja?"));
            CalcularDiaria(quantidadeDeDiarias,tipoDeDiaria);           
        }else{
            JOptionPane.showMessageDialog(null, "Opcão invalida");
        }
        }

        public  static void CalcularDiaria(double quantidade,String diaria) {
            if (diaria.equals("S")) {
                JOptionPane.showMessageDialog(null, "O valor total sera de: "+quantidade*255.50);
        }else if(diaria.equals("S")){
                JOptionPane.showMessageDialog(null, "O valor total sera de: "+quantidade*305.50);
        }else{
                JOptionPane.showMessageDialog(null,"O valor total sera de: "+quantidade*360.50);
        }
        
    }
}


