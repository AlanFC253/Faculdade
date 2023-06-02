import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double produto =Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do produto: "));
        double vendaMedia =Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com a venda media desse produto:"));


        if(vendaMedia<500){
            if(produto<30){
                JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.10) ));
            }else if(produto>=30 && produto< 80){
                JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.15) ));
                    }else{
                    JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto-(produto*0.20) ));
                }
            }else  if(vendaMedia>=500 && vendaMedia< 1200){
                if(produto<30){
                    JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.10) ));
                }else if(produto>=30 && produto< 80){
                    JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.15) ));
                        }else{
                        JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto-(produto*0.20) ));
                    }
                }else{
                    if(produto<30){
                        JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.10) ));
                    }else if(produto>=30 && produto< 80){
                        JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto+(produto*0.15) ));
                            }else{
                            JOptionPane.showMessageDialog(null,String.format("Novo valor do produto: %.2f", produto-(produto*0.20) ));
                }
}
}}