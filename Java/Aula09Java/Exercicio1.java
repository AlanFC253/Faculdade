import javax.swing.JOptionPane;

public class Exercicio1 {
public static void main(String[] args) {
    String frase = JOptionPane.showInputDialog(null,"Entre com uma frase: ");
    String palavra=JOptionPane.showInputDialog(null, "Entre com uma palavra");
    if(frase.contains("escola")){
        JOptionPane.showMessageDialog(null,frase.replaceAll("escola",palavra));
    }else{
        JOptionPane.showInputDialog(null, frase);
    }
}
    
}