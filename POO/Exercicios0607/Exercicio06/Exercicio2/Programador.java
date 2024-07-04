package Exercicio2;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Programador extends Empregado{
   private float quantidadeDeHoras;
   private float valorHora;


    public float getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }
    public void setQuantidadeDeHoras(float quantidadeDeHoras) {
        this.quantidadeDeHoras = quantidadeDeHoras;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Programador(){}
    
    public Programador(String nome,String matricula,float quantidadeDeHoras,float valorHora){
        setNome(nome);
        setMatricula(matricula);
        setQuantidadeDeHoras(quantidadeDeHoras);
        setValorHora(valorHora);
    }

    @Override
    float calcularSalario() {
        float salario = getQuantidadeDeHoras()*getValorHora();
        return salario;
    }
    @Override
    void mostrar() {
        System.out.println("O nome desse programador é: "+getNome());
        System.out.println("A matricula desse programador é: "+getMatricula());
        System.out.println("A quantidade de horas desse programador é: "+getQuantidadeDeHoras());
        System.out.println("O valor pro hora desse programador é: "+getValorHora());
        System.out.println("O salario desse programador foi de: "+calcularSalario());
        System.out.println();
    }

}
