import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        double salario=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com seu salario:"));
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o codigo do seu cargo:"));

        switch (codigo) {
            case 1:
                salario=salario+(salario/2);
                JOptionPane.showMessageDialog(null,"Cargo:Escriturário \nSeu novo salario sera de: "+salario);
                break;
            case 2:
                salario=salario+(salario*0.35);
                JOptionPane.showMessageDialog(null,"Cargo:Secretário \nSeu novo salario sera de: "+salario);
                break;
            case 3:
                salario=salario+(salario*0.20);
                JOptionPane.showMessageDialog(null,"Cargo:Caixa \nSeu novo salario sera de: "+salario);
                break;
            case 4:
                salario=salario+(salario*0.10);
                JOptionPane.showMessageDialog(null,"Cargo:Gerente \nSeu novo salario sera de: "+salario);
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Cargo:Diretor \nSem aumento, o valor continuara: "+salario);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Codigo invalido");
                break;
        }
    }
    
}