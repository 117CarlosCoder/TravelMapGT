
package NodoArbolB;

import Grafo.NodoGrafo;
import Key.Key;

/**
 *
 * @author carlosl
 */
public class NodoArbolB {

    private int clavesEnNodo; 
    private boolean hoja; 
    private Key keys[];
    private int key[];  
    private NodoArbolB hijos[]; 

    
    public NodoArbolB(int t) {
        clavesEnNodo = 0;
        hoja = true;
        key = new int[((2 * t) - 1)];
        keys = new Key[((2 * t) - 1)];
        hijos = new NodoArbolB[(2 * t)];
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < clavesEnNodo; i++) {
            if (i < clavesEnNodo - 1) {
                System.out.print(key[i] + " ");
                for (Key key1 : keys) {
                    if (key1 != null && key1.getNodosgrafo() != null) {
                        for (NodoGrafo nodoGrafo : key1.getNodosgrafo()) {
                        if (nodoGrafo != null) {
                            System.out.print(nodoGrafo.getDestino( )+ " "); 
                        }
                        
                    }
                    }
                    
                   
                }
                System.out.print(" | ");  
                 
            } else {
                System.out.print(key[i]);
                System.out.print(keys[i]);
            }
        }
        System.out.print("]");
        System.out.println(); 
    }

    public int find(int k) {
        for (int i = 0; i < clavesEnNodo; i++) {
            if (key[i] == k) {
                return i;
            }
             if (keys[i].getKey() == k) {
                return i;
            }
        }
        return -1;
    }

    public int getClavesEnNodo() {
        return clavesEnNodo;
    }

    public void setClavesEnNodo(int n) {
        this.clavesEnNodo = n;
    }

    public boolean ishoja() {
        return hoja;
    }

    public void sethoja(boolean hoja) {
        this.hoja = hoja;
    }

    public int[] getKey() {
        return key;
    }

    public void setKey(int[] key) {
        this.key = key;
    }

    public NodoArbolB[] getHijos() {
        return hijos;
    }

    public void setHijos(NodoArbolB[] child) {
        this.hijos = child;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }
    
    
}
