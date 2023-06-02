/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Pichau
 */
public class Filmes {
    public String titulo;
    public String diretor;
    public String genero;
    public String pais;
    public String ano;
    
    public Filmes(String titulo,String diretor,String genero,String pais,String ano){
        this.ano=ano;
        this.diretor=diretor;
        this.genero=genero;
        this.pais=pais;
        this.titulo=titulo;
    }

    @Override
    public String toString() {
        return "\nFilme{" + "titulo=" + titulo + ", diretor=" + diretor + ", genero=" + genero + ", pais=" + pais + ", ano=" + ano + '}';
    }
    
    
}
