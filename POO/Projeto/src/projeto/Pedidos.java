package projeto;


public class Pedidos {
    private Pizza pizza;
    private Borda borda;
    private Acompanhamento acompanhamento;
    private double preco;
    private String comentario;

    //Construtores
    public Pedidos(Pizza pizza, Acompanhamento acompanhamento,Borda borda,String comentario) {
        setComentario(comentario);
        setPizza(pizza);
        setBorda(borda);
        setAcompanhamento(acompanhamento);
        setPreco(pizza.verificarPreco()+ borda.verificarPreco()+ acompanhamento.getPreco());
        
    }
    
    //Metodos
    @Override
    public String toString() {
        if(this.pizza.isMetade()){
            return "Pedido:\n Pizza sabor meia: "+getPizza().getSabor()+" e meia: "+getPizza().getSabor2()+",\n Borda: "+getBorda().getTipo()+",\n Acompanhamento: "+getAcompanhamento().getNome()+" "+getAcompanhamento().getTipo()+", \n Preço Final: R$ "+String.format("%.2f",getPreco())+"\n\nComentarios: "+getComentario()+"\n______________________________________\n";
        }else{
             return "Pedido:\n Pizza sabor: "+getPizza().getSabor()+",\n Borda: "+getBorda().getTipo()+",\n Acompanhamento: "+getAcompanhamento().getNome()+" "+getAcompanhamento().getTipo()+",\n Preço Final: R$ "+String.format("%.2f",getPreco())+"\n\nComentarios: "+getComentario()+"\n______________________________________\n";
        }
    }
    
    //Getters e Setters
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Borda getBorda() {
        return borda;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    public Acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(Acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
}
