package Exercicio07.Exercicio1;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Professor extends Pessoa{
    private int matricula;
    private String campus;
    
    public int getMatricula() {
        return matricula;
    }



    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    public String getCampus() {
        return campus;
    }



    public void setCampus(String campus) {
        this.campus = campus;
    }



    public Professor(){}


    
    @Override
    String mostrarClasse() {
        return "Professor selecionado";
    }
    
}
