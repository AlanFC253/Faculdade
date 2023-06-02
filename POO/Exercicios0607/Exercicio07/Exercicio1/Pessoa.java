package Exercicio07.Exercicio1;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(){};

    abstract String mostrarClasse();

}
