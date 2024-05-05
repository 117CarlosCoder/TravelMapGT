/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Key;

import Grafo.NodoGrafo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlosl
 */
public class Key {
    private int key;
    private List<NodoGrafo> nodosgrafo;

    public Key(int key) {
        this.key = key;
        this.nodosgrafo = new ArrayList<>();
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        System.out.println("key en la key " + key);
        this.key = key;
    }

    public List<NodoGrafo> getNodosgrafo() {
        return nodosgrafo;
    }

    public void setNodosgrafo(List<NodoGrafo> nodosgrafo) {
        this.nodosgrafo = nodosgrafo;
    }

    @Override
    public String toString() {
        return "Key{" + "nodosgrafo=" + nodosgrafo + '}';
    }
    
    
}
