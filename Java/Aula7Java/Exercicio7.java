import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual sua idade:"));

        if(idade<16){
            JOptionPane.showMessageDialog(null, "Não-eleitor");
        }else if(idade>=18 && idade<=65){
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
        }else{
            JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }
    }
}
