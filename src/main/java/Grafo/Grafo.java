package Grafo;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlosl
 */
public class Grafo {
    
    private String valor;
    protected List<NodoGrafo> nodos;

    public Grafo() {
        
    }

    public Grafo(String valor,  List<NodoGrafo> nodos) {
        this.valor = valor;
        this.nodos = nodos;
    }
    
    public void imprimirNodos(){
        
        System.out.println("Grafo: " + valor);
        
        for (NodoGrafo nodo : this.nodos ) {
            System.out.println("Nodo: " + nodo.getDestino());
        }
        
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public  List<NodoGrafo> getNodos() {
        return nodos;
    }

    public void setNodo(NodoGrafo nodo) {
        this.nodos.add(nodo);
    }

    public void setNodos(List<NodoGrafo> nodos) {
        this.nodos = nodos;
    }

    

    
    
}
