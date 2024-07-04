package exercicio5;

import javax.swing.JOptionPane;

public class Objeto {

  public String nome;
  public double velocidade;
  public double distancia;
  public double tempo;


  public Objeto() {
    this.nome = JOptionPane.showInputDialog(null, "Entre com o nome do objeto: ");
    this.distancia = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a distancia:"));;
    this.tempo = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o Tempo:"));
    getVelocidade();
  }


  public double getVelocidade(){
    this.velocidade=this.distancia/this.tempo;
    JOptionPane.showMessageDialog(null, "O nome do Objeto é: "+this.nome+"\n A distancia percorrida é: "+this.distancia+"\n O tempo é de "+this.tempo+
    "\n E a velocidade: "+this.velocidade);
    return velocidade;
  }
  
}