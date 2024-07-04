package projeto;

public class Pizza extends Produto {

    private String tamanho,sabor,sabor2;
    private double preco2;
    private boolean metade;
    
    //Construtor
        public Pizza(String sabor, String tamanho, boolean metade,String sabor2) {
            setMetade(metade);
            setSabor(sabor);
            setSabor2(sabor2);
         
            
        //Definir o preço do primeiro sabor
        switch (sabor) {
            case "Mussarela":
                setPreco(28.80);
                break;

            case "Escarola":
                setPreco(32.50);
                break;

            case "Marguerita":
                setPreco(33.00);
                break;

            case "Atum":
                setPreco(34.00);
                break;

            case "Romana":
                setPreco(30.00);
                break;
                
            case "Calabresa":
                setPreco(30.00);
                break;

            case "Napolitana":
                setPreco(35.00);
                break;

            case "Brócolis":
                setPreco(32.00);
                break;

            case "Portuguesa":
                setPreco(33.50);
                break;

            case "Bacon":
                setPreco(35.50);
                break;

            case "Frango com Catupiry":
                setPreco(36.50);
                break;

            case "Chocolate":
                setPreco(31.50);
                break;

            case "Prestígio":
                setPreco(34.50);
                break;

            case "Beijinho":
                setPreco(33.00);
                break;

            case "M&M":
                setPreco(33.50);
                break;

            case "Nutella com Morango":
                setPreco(37.50);
                break;
        }
        
            
            
        //Definir valor do segundo sabor
        switch (sabor2) {
            case "Nenhuma":
                setPreco2(0.0);
                break;
                
            case "Mussarela":
                setPreco2(28.80);
                break;

            case "Escarola":
                setPreco2(32.50);
                break;

            case "Marguerita":
                setPreco2(33.00);
                break;

            case "Atum":
                setPreco2(34.00);
                break;

            case "Romana":
                setPreco2(30.00);
                break;
                
            case "Calabresa":
                setPreco2(30.00);
                break;

            case "Napolitana":
                setPreco2(35.00);
                break;

            case "Brócolis":
                setPreco2(32.00);
                break;

            case "Portuguesa":
                setPreco2(33.50);
                break;

            case "Bacon":
                setPreco2(35.50);
                break;

            case "Frango com Catupiry":
                setPreco2(36.50);
                break;

            case "Chocolate":
                setPreco2(31.50);
                break;

            case "Prestígio":
                setPreco2(34.50);
                break;

            case "Beijinho":
                setPreco2(33.00);
                break;

            case "M&M":
                setPreco2(33.50);
                break;

            case "Nutella com Morango":
                setPreco2(37.50);
                break;
        }
        
        
        //Modificar valor de acordo com o tamanho
        switch (tamanho) {
            case "Pequena":
                setPreco(getPreco()*0.8);
                setPreco2(getPreco2()*0.8);
            case "Média":
                setPreco(getPreco()*1.0);
                setPreco2(getPreco2()*1.0);
            case "Grande":
               setPreco(getPreco()*1.2);
                setPreco2(getPreco2()*1.2);
        }
       
    }
        
        
    //Metodos
        
    @Override
    public double verificarPreco() {
        if (getPreco() > getPreco2()){
            return getPreco();
        }
        else{
            return getPreco2();
                    }
    }
    
    //Getters e Setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor2() {
        return sabor2;
    }

    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public boolean isMetade() {
        return metade;
    }

    public void setMetade(boolean metade) {
        this.metade = metade;
    }

    
    
   
    
}
