
public class Funcionario {
    public int cracha;
    public float salario;
    public String cargo;

    public Funcionario(){
        this.cargo="Assistente";
    }

    public Funcionario(int c,float s, String car){
        this.cracha=c;
        this.salario=s;
        this.cargo=car;
    }

    public float calculaAumento( float porcentagem) {
        float novosalario = this.salario+(salario*(porcentagem/100));
        return novosalario;
    }
    public float calculaAumento( int tempo){
        float novosalario=this.salario+(150*tempo);
        return novosalario;
    }

}
