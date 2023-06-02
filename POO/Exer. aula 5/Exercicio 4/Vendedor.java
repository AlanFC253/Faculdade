public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    //Construtor

    public Vendedor( float v, float s, String n, int f){
        setVendas(v);
        setSalario(s);
        setNome(n);
        setFalta(f);
    }

    //Gettens
    public float getVendas() {
        return vendas;
    }
    public float getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public int getFalta() {
        return falta;
    }

    //Settes
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFalta(int falta) {
        this.falta = falta;
    }

    //Outros metodos


    public float calcularComissao() {
        float comissao;

        if(getVendas()>=1000 && getVendas()<2000){
          comissao = getVendas()*(10/100);
        }else if(getVendas()>=2000){
           comissao =getVendas()*(15/100);
        }else{
            comissao=0;
        }

        return comissao;
    }
    
    public float descontoFalta() {
        float desconto=(getSalario()/30)*falta;
        return desconto;        
    }

    public void calcularSalario() {
        float salarioFinal = getSalario()+calcularComissao()-descontoFalta() ;
        System.out.println("O salario no final do mes sera:"+salarioFinal);
    }

    public void imprimirDados() {
        System.out.println("Nome do vendedor: "+getNome());
        System.out.println("Salario normal do vendedor: "+getSalario());
        System.out.println("Numero de vendas do vendedor: "+getVendas());
        System.out.println("Numero de faltas do vendedor: "+getFalta());
        System.out.println("Comissao pelas vendas do vendedor: "+calcularComissao());
        System.out.println("Desconto pelas faltas do vendedor: "+descontoFalta());
        calcularSalario();
    }

}
