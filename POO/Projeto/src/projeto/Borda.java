package projeto;

public class Borda extends Produto{

    private String tipo;
    
    //Construtores
    public Borda(String tipo) {
        setTipo(tipo);
    }

    //Metodos
       @Override
    public double verificarPreco() {
        //Definir o valor da borda pelo tipo
        switch (getTipo()) {
            case "Sem borda":
                setPreco(0.0);
                break;
            case "Catupiry":
                setPreco(5.0);
                break;
            case "Chedar":
                setPreco(4.0);
                break;
            case "Mussarela":
                setPreco(8.0);
                break;
            case "Chocolate":
                setPreco(6.0);
                break;
            case "Nutella":
                setPreco(7.0);
                break;
        }
           return getPreco();
    }
    
    //Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
