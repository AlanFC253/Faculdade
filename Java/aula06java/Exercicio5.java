import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double precoAVista,quantidadeDeParcelas,valorDaParcela;
        precoAVista= Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor do produto a vista?" ));
        quantidadeDeParcelas=Double.parseDouble(JOptionPane.showInputDialog(null, "Em quantas vezes ira dividir?"));

        if(quantidadeDeParcelas>=3){
            precoAVista=precoAVista+(precoAVista*10/100);
            valorDaParcela=precoAVista/quantidadeDeParcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela sera:"+valorDaParcela);
        }else{
            precoAVista=precoAVista+(precoAVista*20/100);
            valorDaParcela=precoAVista/quantidadeDeParcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela sera:"+valorDaParcela);
        }
    }
}
