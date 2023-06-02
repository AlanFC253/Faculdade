/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projeto;

/**
 *
 * @author Pichau
 */
public interface TAD_Pilha { 
    public Object push (Object x);
//Método para inserir um novo item x no topo da pilha.
// pré-condições:
// a pilha deverá ter espaço para inserir: verificar se !isFull()
// o objeto a inserir x não poderá ser nulo
// pós-condições:
// retornará diferente de nulo se a inserção foi possível
// o topo será modificado, apontando ao novo item
public Object pop ();
//Método para retirar o item que se encontra no topo da pilha.
// pré-condições:
// não poderá retirar da pilha se estiver vazia: verificar se !isEmpty()
// pós-condições:
// retornará o objeto que se encontra no topo da pilha
// retornará nulo se a pila está vazia
// o topo será modificado, apontando ao próximo item
public boolean isEmpty ();
//Método que verifica se a pilha está vazia.
//Por exemplo, não poderão ser retirados valores se a pilha estiver vazia.
public boolean isFull ();
//Método que verifica se a pilha está cheia, ou seja, não existe
//memória para adicionar mais elementos.
public Object top();
//Método para retornar o item que se encontra no topo da
//pilha, sem eliminar o mesmo
// pré-condições:
// não poderá retornar o item se a pilha se estiver vazia
// pós-condições:
// retornará o objeto que se encontra no topo da pilha
// retornará nulo se a pila está vazia
// o topo não será modificado, nem a pilha
public String toString(String endereco,boolean entregar);
}
