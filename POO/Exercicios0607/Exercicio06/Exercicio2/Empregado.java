package Exercicio2;

public abstract class Empregado {
    private String nome;
    private String matricula;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Empregado(){

    }
    public Empregado(String nome, String matricula){
        setNome(nome);
        setMatricula(matricula);
    }

    abstract float calcularSalario();
    abstract void mostrar();
}
