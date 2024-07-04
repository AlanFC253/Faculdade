package Exercicio07.Exercicio2;
// Alan Fernandes Cavalcante
// Rgm:52953004-1
public class Gerente extends Funcionario{
    private int senha;
    private int funcionariosGerenciados;
    
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getFuncionariosGerenciados() {
        return funcionariosGerenciados;
    }
    public void setFuncionariosGerenciados(int funcionariosGerenciados) {
        this.funcionariosGerenciados = funcionariosGerenciados;
    }
    public Gerente(){}
    public Gerente(int senha,int fG){
        setSenha(senha);
        setFuncionariosGerenciados(fG);
    }

    @Override
    public double bonificacao() {
        double bonificacao = getSalario()*(15/100);
        return bonificacao;
    }
    
    @Override
    public boolean autentica() {
        System.out.println("Esse funcionario é um Gerente");
        return true;
    }

}
