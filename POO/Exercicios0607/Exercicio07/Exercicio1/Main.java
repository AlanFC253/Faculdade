package Exercicio07.Exercicio1;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa p= null;

        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:"
            +"\n1- Aluno"
            +"\n2- Professor"
            +"\n3- Funcionario"
            +"\n4- Sair"
        ));

        switch (tipo) {
            case 1:
                p=new Aluno();
                break;
            case 2:
                p=new Professor();
                break;
            case 3:
                p=new Funcionario();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Falouuuu", null, 0);
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opção invalida", null, 0);
                break;
        }

       JOptionPane.showMessageDialog(null,  p.mostrarClasse(), null, tipo);
    }
}
