package Exercicio2;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Analista extends Empregado{
    private float[] valorPorProjeto;

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }
    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }
    public Analista(){

    }

    public Analista(String nome,String matricula, float vp[]){
        setMatricula(matricula);
        setNome(nome);
        setValorPorProjeto(vp);
    }

    @Override
    float calcularSalario() {
        float salario=0;
        for(int i =0;i<getValorPorProjeto().length;i++){
            salario+=getValorPorProjeto()[i];
            
        }
        return salario;
    }
    @Override
    void mostrar() {
        System.out.println("O nome desse Analista é: "+getNome());
        System.out.println("A matricula desse Analista é: "+getMatricula());
        System.out.println("E o salario desse Analista foi de: "+calcularSalario());
        System.out.println();
    }
    
}
