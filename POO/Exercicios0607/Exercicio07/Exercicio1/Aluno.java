package Exercicio07.Exercicio1;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Aluno extends Pessoa{


    private String rgm;

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    @Override
    String mostrarClasse() {
        return "Aluno selecionado";
    }
    
}
