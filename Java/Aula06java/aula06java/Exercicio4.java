import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        double luz,agua,telefone,salario,somaContas;
        luz=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da conta de luz: "));
        agua=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da conta de agua: "));
        telefone=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da conta de telefone"));
        salario=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do seu salario:"));

        somaContas=luz+agua+telefone;

        if(somaContas>salario){
            JOptionPane.showMessageDialog(null,"Salário insuficiente!");
        }else{
            double temNaSuficiente=salario-somaContas;
            JOptionPane.showMessageDialog(null, "Salario sufiente\n Valor pos-pagamento das contas: "+temNaSuficiente);
        }
    }
}
