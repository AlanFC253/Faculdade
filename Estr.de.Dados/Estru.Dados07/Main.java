class Main{

    private Pilha pilha=null;
    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        criandoAPilha();
        System.out.println("Pilha inicial:");
        System.out.println(pilha.toString());
        System.out.println();
        System.out.println("Retirando e esvaziando a pilha:");
        while ( !pilha.isEmpty() ) {
           System.out.println(pilha.pop());
        }
        if ( pilha.isEmpty() ) 
        System.out.println("Impossível retirar da pilha. Pilha vazia.");    
    }

    public void criandoAPilha() {
        
        pilha = new Pilha(7);

        pilha.push(new Veiculo("1234-ETH","Ford","sla1",2023));
        pilha.push(new Veiculo("4321-ETH","ASton","sla2",2022));
        pilha.push(new Veiculo("1234-HTE","Audi","sla3",2021));
        pilha.push(new Veiculo("2563-QWE","BYD","sla4",2020));
        pilha.push(new Veiculo("3652-EWQ","Chevrolet","sla5",2019));
        pilha.push(new Veiculo("5664-XDS","CAOA","sla6",2018));
        pilha.push(new Veiculo("4665-SDX","Citroen","sla7",2017));
    }
}