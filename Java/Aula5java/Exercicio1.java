


import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args) {
        double kmInicial,kmFinal,litrosGastos,precoDoLitro;
        kmInicial=Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o km inicial:"));
        kmFinal=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o km final:"));
        litrosGastos=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com os litros gastos:"));
        precoDoLitro=Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o preco do litro"));
        viagem(kmInicial, kmFinal, litrosGastos, precoDoLitro);
            
    }
    public static void viagem(double kmInicial,double kmFinal,double litrosGastos,double precoDoLitro){
        double distanciaPercorrida=kmFinal-kmInicial;
        double consumoMedio=distanciaPercorrida/litrosGastos;
        double valorGasto= litrosGastos*precoDoLitro;
        JOptionPane.showMessageDialog(null, String.format("A distacia percorrida foi de: %.2f \n O consumo medio foi: %.2f \n E o gasto: %.2f",distanciaPercorrida,consumoMedio,valorGasto), "Viagem", 1);
    } 
}