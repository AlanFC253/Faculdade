import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        int placar = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o ultimo digito da sua placar"));

        if(placar==1||placar==2){
            JOptionPane.showMessageDialog(null, "Rodízio na segunda-feira");
        }else if(placar==3||placar==4){
            JOptionPane.showMessageDialog(null, "Rodízio na terça-feira");
        }else if(placar==5||placar==6){
            JOptionPane.showMessageDialog(null, "Rodízio na quarta-feira");
        }else if(placar==7||placar==8){
            JOptionPane.showMessageDialog(null, "Rodízio na quinta-feira");
        }else if(placar==9||placar==0){
            JOptionPane.showMessageDialog(null, "Rodízio na sexta-feira");
        }else{
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    }
}