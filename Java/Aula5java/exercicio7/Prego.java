package exercicio7;

public class Prego {
    protected double valor;
    protected int quantidade;
    static double valorTotal;

     double getArrecadado(){
        return this.valor*this.quantidade;
    }

}
