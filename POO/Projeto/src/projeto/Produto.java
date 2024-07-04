
package projeto;


public abstract class Produto {
    private double preco;

    public Produto() {}
        
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public abstract double verificarPreco();
    
}
