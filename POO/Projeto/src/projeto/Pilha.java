/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Pichau
 */
public class Pilha implements TAD_Pilha {

    private int topo; //topo da pilha
    private int MAX; //tamanho máximo da pilha
    private Object memo[];

    public Pilha() {
        topo = -1; // esta é a convenção que utilizaremos para "pilha vazia"
        MAX = 50;
        memo = new Object[MAX];
    }

    @Override
    public Object push(Object x) {
        if (!isFull() && x != null) {
            memo[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return (topo == -1);
    }

    @Override
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    @Override
    public Object top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }

    @Override
    public String toString(String endereco, boolean entregar) {
        if (entregar) {
            if (!isEmpty()) {
                String saida = "";
                double precoFinal = 0;
                Pedidos valor;
                for (int i = 0; i <= topo; i++) {
                    saida += memo[i].toString();
                    valor = (Pedidos) memo[i];
                    precoFinal += valor.getPreco();
                    if (i != topo) {
                        saida += "\n";
                    }
                }
                saida += "\nTotal: R$ " + String.format("%.2f", precoFinal) + "\n" + "\n" + endereco + "\n\nObrigado a preferencia :D";
                return saida;
            } else {
                return ("Sem pedidos realizados"); // fila vazia   
            }
        }else{
            if (!isEmpty()) {
                String saida = "";
                double precoFinal = 0;
                Pedidos valor;
                for (int i = 0; i <= topo; i++) {
                    saida += memo[i].toString();
                    valor = (Pedidos) memo[i];
                    precoFinal += valor.getPreco();
                    if (i != topo) {
                        saida += "\n";
                    }
                }
                saida+="\nTotal do pedido: R$ "+String.format("%.2f",precoFinal)+"\n"+"\nObrigado a preferencia :D";
                return saida;
            } else {
                return ("Sem pedidos realizados"); // fila vazia   
            } 
        }
    }
}
