public class Torneio {
    private String nome;
    private int idade;
    
    //Construtor
    public Torneio(String nome,int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    //Settes
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Outros metodos

    public String verificarCategoria() {
        if(this.idade>=5 && this.idade<=7){
            return "Infantil";
        }else if(this.idade>=8 && this.idade<=10){
            return "Juvenil";
        }else if(this.idade>=11 && this.idade<=15){
            return "Adolescente";
        }else if(this.idade>=16 && this.idade<=30){
            return "Adulto";
        }else if(this.idade >30){
            return "Adolescente";
        }else{
            return "Não pode competir, muito novo";
        }
    }

    public void imprimirDados() {
        System.out.println("O nome desse Participante é: "+this.getNome());
        System.out.println("A idade desse participante é: "+this.getIdade());
        System.out.println("E a categoria desse participante é: "+verificarCategoria());
    }

}
