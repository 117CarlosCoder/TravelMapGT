/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodoArbolB;

import Grafo.NodoGrafo;
import Key.Key;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlosl
 */
public class NodoArbolB {

    private int n; //numero de claves almacenadas en el nodo
    private boolean leaf; //Si el nodo es hoja (nodo hoja=true; nodo interno=false)
    private Key keys[];
    private int key[];  //almacena las claves en el nodo
    private NodoArbolB child[]; //arreglo con referencias a los hijos

    //Constructores
    public NodoArbolB(int t) {
        n = 0;
        leaf = true;
        key = new int[((2 * t) - 1)];
        keys = new Key[((2 * t) - 1)];
        child = new NodoArbolB[(2 * t)];
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(key[i] + " ");
                for (Key key1 : keys) {
                    for (NodoGrafo nodoGrafo : key1.getNodosgrafo()) {
                        System.out.print(nodoGrafo.getDestino( )+ " "); 
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
        for (int i = 0; i < n; i++) {
            if (key[i] == k) {
                return i;
            }
             if (keys[i].getKey() == k) {
                return i;
            }
        }
        return -1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public int[] getKey() {
        return key;
    }

    public void setKey(int[] key) {
        this.key = key;
    }

    public NodoArbolB[] getChild() {
        return child;
    }

    public void setChild(NodoArbolB[] child) {
        this.child = child;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }
    
    
}
