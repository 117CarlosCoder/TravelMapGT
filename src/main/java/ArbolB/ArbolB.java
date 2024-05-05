/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolB;

import Grafo.NodoGrafo;
import Key.Key;
import NodoArbolB.NodoArbolB;
import java.util.List;


/**
 *
 * @author carlosl
 */
public class ArbolB {
    NodoArbolB root;
    int t;

    //Constructor
    public ArbolB(int t) {
        this.t = t;
        root = new NodoArbolB(t);
    }

    public int buscarClaveMayor() {
        int claveMaxima = getClaveMayor(this.root);

        return claveMaxima;
    }

    private int getClaveMayor(NodoArbolB current) {
        if (current == null) {
            return 0;//Si es cero no existe
        }
        //Mientras no sea una hoja
        while (!current.isLeaf()) {
            //Se accede al hijo mas a la derecha
            current = current.getChild()[current.getN()];
        }

        return claveMayorPorNodo(current);
    }

    private int claveMayorPorNodo(NodoArbolB current) {
        //Devuelve el valor mayor, el que esta mas a la derecha
        return current.getKeys()[current.getN() - 1].getKey();
    }

    public void mostrarClavesNodoMinimo() {
        NodoArbolB temp = buscarNodoMinimo(root);

        if (temp == null) {
            System.out.println("Sin minimo");
        } else {
            temp.imprimir();
        }
    }

    public NodoArbolB buscarNodoMinimo(NodoArbolB nodoActual) {
        if (root == null) {
            return null;
        }

        NodoArbolB aux = root;

        //Mientras no sea una hoja
        while (!aux.isLeaf()) {
            //Se accede al primer hijo
            aux = aux.getChild()[0];
        }

        //Devuelve el nodo menor, el que esta mas a la izquierda
        return aux;
    }

    //Busca el valor ingresado y muestra el contenido del nodo que contiene el valor
    public void buscarNodoPorClave(int num) {
        NodoArbolB temp = search(root, num);

        if (temp == null) {
            System.out.println("No se ha encontrado un nodo con el valor ingresado");
        } else {
            print(temp);
        }
    }

    //Search
    private NodoArbolB search(NodoArbolB actual, int key) {
        int i = 0;//se empieza a buscar siempre en la primera posicion

        //Incrementa el indice mientras el valor de la clave del nodo sea menor
        while (i < actual.getN() && key > actual.getKey()[i]) {
            i++;
        }

        //Si la clave es igual, entonces retornamos el nodo
        if (i < actual.getN() && key == actual.getKey()[i]) {
            return actual;
        }

        //Si llegamos hasta aqui, entonces hay que buscar los hijos
        //Se revisa primero si tiene hijos
        if (actual.isLeaf()) {
            return null;
        } else {
            //Si tiene hijos, hace una llamada recursiva
            return search(actual.getChild()[i], key);
        }
    }

    public void insertar(int key,List<NodoGrafo> nodografo) {
        NodoArbolB r = root;

        //Si el nodo esta lleno lo debe separar antes de insertar
        if (r.getN() == ((2 * t) - 1)) {
            NodoArbolB s = new NodoArbolB(t);
            root = s;
            s.setLeaf(false); 
            s.setN(0); 
            s.getChild()[0] = r;
            split(s, 0, r);
            nonFullInsert(s, key, nodografo);
        } else {
            nonFullInsert(r, key, nodografo);
        }
    }
    
    // Caso cuando la raiz se divide
    // x =          | | | | | |
    //             /
    //      |10|20|30|40|50|
    // i = 0
    // y = |10|20|30|40|50|
    private void split(NodoArbolB x, int i, NodoArbolB y) {
        //Nodo temporal que sera el hijo i + 1 de x
        NodoArbolB z = new NodoArbolB(t);
        z.setLeaf(y.isLeaf());
        z.setN(t - 1); 

        //Copia las ultimas (t - 1) claves del nodo y al inicio del nodo z      // z = |40|50| | | |
        for (int j = 0; j < (t - 1); j++) {
            z.getKey()[j] = y.getKey()[(j + t)];
            z.getKeys()[j] = y.getKeys()[j+t];
        }

        //Si no es hoja hay que reasignar los nodos hijos
        if (!y.isLeaf()) {
            for (int k = 0; k < t; k++) {
                z.getChild()[k] = y.getChild()[(k + t)];
         
            }
        }

        //nuevo tamanio de y                                                    // x =            | | | | | |
        y.setN(t - 1);                                                           //               /   \
                                                                                //  |10|20| | | |
        //Mueve los hijos de x para darle espacio a z
        for (int j = x.getN(); j > i; j--) {
            x.getChild()[(j + 1)] = x.getChild()[j];
        }
        //Reasigna el hijo (i+1) de x                                           // x =            | | | | | |
        x.getChild()[(i + 1)] = z;                                                   //               /   \
                                                                                //  |10|20| | | |     |40|50| | | |
        //Mueve las claves de x
        for (int j = x.getN(); j > i; j--) {
            x.getKey()[(j + 1)] = x.getKey()[j];
            x.getKeys()[j+1]= x.getKeys()[j];
        }

        //Agrega la clave situada en la mediana                                 // x =            |30| | | | |
        x.getKey()[i] = y.getKey()[(t - 1)];  
        x.getKeys()[i] = y.getKeys()[(t - 1)]; //               /    \
        x.setN(x.getN()+1);                                                                  //  |10|20| | | |      |40|50| | | |
    }

    private void nonFullInsert(NodoArbolB x, int key, List<NodoGrafo> nodoGrafo) {
        //Si es una hoja
        if (x.isLeaf()) {
            int i = x.getN(); //cantidad de valores del nodo
            //busca la posicion i donde asignar el valor
            while (i >= 1 && key < x.getKey()[i - 1]) {
                x.getKey()[i] = x.getKey()[i - 1];
                x.getKeys()[i] = x.getKeys()[i-1];//Desplaza los valores mayores a key
                i--;
            }

            x.getKey()[i] = key;//asigna el valor al nodo
            System.out.println("key "+ key);
            System.out.println("i " + i);
            x.getKeys()[i] = new Key(i);
            x.getKeys()[i].setKey(key);
            x.getKeys()[i].setNodosgrafo(nodoGrafo);
            x.setN(x.getN()+1);//aumenta la cantidad de elementos del nodo
        } else {
            int j = 0;
            //Busca la posicion del hijo
            while (j < x.getN() && key > x.getKey()[j]) {
                j++;
            }

            //Si el nodo hijo esta lleno lo separa
            if (x.getChild()[j].getN() == (2 * t - 1)) {
                split(x, j, x.getChild()[j]);

                if (key > x.getKey()[j]) {
                    j++;
                }
            }

            nonFullInsert(x.getChild()[j], key, nodoGrafo);
        }
    }

    public void showBTree() {
        print(root);
    }

    //Print en preorder
    private void print(NodoArbolB n) {
        n.imprimir();

        //Si no es hoja
        if (!n.isLeaf()) {
            //recorre los nodos para saber si tiene hijos
            for (int j = 0; j <= n.getN(); j++) {
                if (n.getChild()[j] != null) {
                    System.out.println();
                    print(n.getChild()[j]);
                }
            }
        }
    }
}
