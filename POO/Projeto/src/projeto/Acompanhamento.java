package projeto;

public class Acompanhamento extends Produto {

    private String nome, tipo;
    
    
    //Construtores
    public Acompanhamento(String nome, String tipo) {
        setNome(nome);
        setTipo(tipo);
            
        if (getNome().equals("Sem acompanhamento")) {
            setPreco(0.0);
        } else {
            switch (tipo) {
                case "Lata":
                    setPreco(6.0);
                    break;
                case "2 Litros":
                    setPreco(12.0);
                    break;
            }
        }
    }
    
    //Metodos
   public double verificarPreco(){
       return getPreco();
   }
   
    //Gettes e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
