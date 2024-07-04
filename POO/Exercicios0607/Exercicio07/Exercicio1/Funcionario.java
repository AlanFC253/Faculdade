package Exercicio07.Exercicio1;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Funcionario extends Pessoa{

    private int matricula;
    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getSetor() {
        return setor;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }


    private String setor;

    public Funcionario(){}
    

    @Override
    String mostrarClasse() {
        return "Funcionario selecionado";
    }

    
}
