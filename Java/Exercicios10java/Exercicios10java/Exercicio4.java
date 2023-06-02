import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        
        double salarios[][]=new double[10][6];
        String funciorios[]=new String[10];

        for(int i = 0;i<=funciorios.length-1;i++){
            funciorios[i]=JOptionPane.showInputDialog(null, "Entre com o nome do "+(i+1)+"º funcionario:");
        }

        for(int i=0; i<=9; i++){
            for(int j=0; j<=5; j++){
            salarios[i][j]= Double.parseDouble(
            JOptionPane.showInputDialog(null, "qual "+(j+1)+"º salario do funcionario "+funciorios[i]+" ?"));
            }
            }

            for(int i=0;i<=funciorios.length-1;i++){
                double media=0;
                double soma=0;
                for(int j=0;j<=5;j++){
                    soma+=salarios[i][j];
                }
                media=soma/6;
                JOptionPane.showMessageDialog(null,"A media dos salarios do funcionario "+funciorios[i]+" foi de: "+media);
            }

    }
}
