
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
    NodoArbolB raiz;
    int nClaves;

    
    public ArbolB(int t) {
        this.nClaves = t;
        raiz = new NodoArbolB(t);
    }

    public int buscarClaveMayor() {
        int claveMaxima = getClaveMayor(this.raiz);

        return claveMaxima;
    }

    private int getClaveMayor(NodoArbolB actual) {
        if (actual == null) {
            return 0;
        }
        
        while (!actual.ishoja()) {
            
            actual = actual.getHijos()[actual.getClavesEnNodo()];
        }

        return claveMayorPorNodo(actual);
    }

    private int claveMayorPorNodo(NodoArbolB current) {
        
        return current.getKeys()[current.getClavesEnNodo()- 1].getKey();
    }

    public void mostrarClavesNodoMinimo() {
        NodoArbolB temp = buscarNodoMinimo(raiz);

        if (temp == null) {
            System.out.println("Sin minimo");
        } else {
            temp.imprimir();
        }
    }

    public NodoArbolB buscarNodoMinimo(NodoArbolB nodoActual) {
        if (raiz == null) {
            return null;
        }

        NodoArbolB aux = raiz;

        
        while (!aux.ishoja()) {
            
            aux = aux.getHijos()[0];
        }

        
        return aux;
    }

    
    public NodoArbolB buscarNodoPorClave(int num) {
        NodoArbolB temp = search(raiz, num);

        if (temp == null) {
            System.out.println("No se ha encontrado un nodo con el valor ingresado");
        } else {
            print(temp);
            return temp;
        }
        NodoArbolB nodoArbolB = new NodoArbolB(0);
        nodoArbolB.setKeys(new Key[1]);
        return nodoArbolB;
    }

    
    private NodoArbolB search(NodoArbolB actual, int key) {
        int i = 0;

        
        while (i < actual.getClavesEnNodo() && key > actual.getKey()[i]) {
            i++;
        }

        
        if (i < actual.getClavesEnNodo() && key == actual.getKey()[i]) {
            return actual;
        }

        
        
        if (actual.ishoja()) {
            return null;
        } else {
            
            return search(actual.getHijos()[i], key);
        }
    }

    public void insertar(int key,List<NodoGrafo> nodografo) {
        NodoArbolB r = raiz;

        
        if (r.getClavesEnNodo()== ((2 * nClaves) - 1)) {
            NodoArbolB s = new NodoArbolB(nClaves);
            raiz = s;
            s.sethoja(false); 
            s.setClavesEnNodo(0); 
            s.getHijos()[0] = r;
            split(s, 0, r);
            nonFullInsert(s, key, nodografo);
        } else {
            nonFullInsert(r, key, nodografo);
        }
    }
    
    
    
    
    
    
    
    private void split(NodoArbolB x, int i, NodoArbolB y) {
        
        NodoArbolB temp = new NodoArbolB(nClaves);
        temp.sethoja(y.ishoja());
        temp.setClavesEnNodo(nClaves - 1); 

        
        for (int j = 0; j < (nClaves - 1); j++) {
            temp.getKey()[j] = y.getKey()[(j + nClaves)];
            temp.getKeys()[j] = y.getKeys()[j+nClaves];
        }

        
        if (!y.ishoja()) {
            for (int k = 0; k < nClaves; k++) {
                temp.getHijos()[k] = y.getHijos()[(k + nClaves)];
         
            }
        }

        
        y.setClavesEnNodo(nClaves - 1);                                                           
                                                                                
        
        for (int j = x.getClavesEnNodo(); j > i; j--) {
            x.getHijos()[(j + 1)] = x.getHijos()[j];
        }
        
        x.getHijos()[(i + 1)] = temp;                                                   
                                                                                
        
        for (int j = x.getClavesEnNodo(); j > i; j--) {
            x.getKey()[(j + 1)] = x.getKey()[j];
            x.getKeys()[j+1]= x.getKeys()[j];
        }

        
        x.getKey()[i] = y.getKey()[(nClaves - 1)];  
        x.getKeys()[i] = y.getKeys()[(nClaves - 1)]; 
        x.setClavesEnNodo(x.getClavesEnNodo()+1);                                                                  
    }

    private void nonFullInsert(NodoArbolB x, int key, List<NodoGrafo> nodoGrafo) {
        
        if (x.ishoja()) {
            int i = x.getClavesEnNodo(); 
            
            while (i >= 1 && key < x.getKey()[i - 1]) {
                x.getKey()[i] = x.getKey()[i - 1];
                x.getKeys()[i] = x.getKeys()[i-1];
                i--;
            }

            x.getKey()[i] = key;
            System.out.println("key "+ key);
            System.out.println("i " + i);
            x.getKeys()[i] = new Key(i);
            x.getKeys()[i].setKey(key);
            x.getKeys()[i].setNodosgrafo(nodoGrafo);
            x.setClavesEnNodo(x.getClavesEnNodo()+1);
        } else {
            int j = 0;
            
            while (j < x.getClavesEnNodo()&& key > x.getKey()[j]) {
                j++;
            }

            
            if (x.getHijos()[j].getClavesEnNodo()== (2 * nClaves - 1)) {
                split(x, j, x.getHijos()[j]);

                if (key > x.getKey()[j]) {
                    j++;
                }
            }

            nonFullInsert(x.getHijos()[j], key, nodoGrafo);
        }
    }

    public void showBTree() {
        print(raiz);
    }

    
    private void print(NodoArbolB n) {
        n.imprimir();

        
        if (!n.ishoja()) {
            
            for (int j = 0; j <= n.getClavesEnNodo(); j++) {
                if (n.getHijos()[j] != null) {
                    System.out.println();
                    print(n.getHijos()[j]);
                }
            }
        }
    }
}
