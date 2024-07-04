package Exercicio07.Exercicio2;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(){

    }

    public Funcionario(String nome, String cpf, double salario) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
    }

    public boolean autentica(){
        System.out.println("Funcionario autenticado");
        return true;
    }
    
    public double bonificacao(){
        double bonificacao = getSalario()*(10/100);
        return bonificacao;
    }

}
