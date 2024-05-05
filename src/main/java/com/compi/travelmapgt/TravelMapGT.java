/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compi.travelmapgt;

import ArbolB.ArbolB;
import Grafo.Grafo;
import Grafo.NodoGrafo;
import UI.UI;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlosl
 */
public class TravelMapGT {

    public static void main(String[] args) {
        
        UI ui = new UI();
        ui.setVisible(true);
        /*
  List<Grafo> grafos;
       grafos = new ArrayList<>();
       grafos.add( new Grafo());
       grafos.add( new Grafo());
       grafos.add( new Grafo());
       grafos.add( new Grafo());
       

       
       grafos.get(0).setValor("AltaveraPaz");
       grafos.get(0).setNodos(new ArrayList<>());
       
       NodoGrafo santamaria =new NodoGrafo();
       santamaria.setOrigen("AltaveraPaz");
       santamaria.setDestino("SantaMaríadeJesús");
       santamaria.setTiempo_promedio_vehiculo(24);
       santamaria.setTiempo_aproximado_a_pie(51);
       santamaria.setGasto_gasolna(24);
       santamaria.setGasto_fisico(456);
       santamaria.setDistancia(85);
       grafos.get(0).setNodo(santamaria);
       
       grafos.get(0).imprimirNodos();
       
       grafos.get(1).setValor("Peten");
       grafos.get(1).setNodos(new ArrayList<>());
       
       NodoGrafo ciudadvieja =new NodoGrafo();
       ciudadvieja.setOrigen("Peten");
       ciudadvieja.setDestino("CiudadVieja");
       ciudadvieja.setTiempo_promedio_vehiculo(24);
       ciudadvieja.setTiempo_aproximado_a_pie(42);
       ciudadvieja.setGasto_gasolna(24);
       ciudadvieja.setGasto_fisico(453);
       ciudadvieja.setDistancia(24);
       grafos.get(1).setNodo(ciudadvieja);
       
       grafos.get(1).imprimirNodos();
       
       grafos.get(2).setValor("Quetzaltenango");
       grafos.get(2).setNodos(new ArrayList<>());
       
       NodoGrafo retauleu =new NodoGrafo();
       retauleu.setOrigen("Quetzaltenango");
       retauleu.setDestino("Retauleu");
       retauleu.setTiempo_promedio_vehiculo(24);
       retauleu.setTiempo_aproximado_a_pie(42);
       retauleu.setGasto_gasolna(24);
       retauleu.setGasto_fisico(453);
       retauleu.setDistancia(24);
       grafos.get(2).setNodo(retauleu);
       
       grafos.get(2).imprimirNodos();
       
       
       grafos.get(3).setValor("Retauleu");
       grafos.get(3).setNodos(new ArrayList<>());
       
       NodoGrafo quetzaltenango =new NodoGrafo();
       quetzaltenango.setOrigen("Retauleu");
       quetzaltenango.setDestino("Quetzaltenango");
       quetzaltenango.setTiempo_promedio_vehiculo(24);
       quetzaltenango.setTiempo_aproximado_a_pie(42);
       quetzaltenango.setGasto_gasolna(24);
       quetzaltenango.setGasto_fisico(453);
       quetzaltenango.setDistancia(24);
       grafos.get(3).setNodo(quetzaltenango);
       
       grafos.get(3).imprimirNodos();
       
       
       NodoGrafo retauleu2 =new NodoGrafo();
       retauleu2.setOrigen("Quetzaltenango");
       retauleu2.setDestino("Retauleu2");
       retauleu2.setTiempo_promedio_vehiculo(24);
       retauleu2.setTiempo_aproximado_a_pie(42);
       retauleu2.setGasto_gasolna(24);
       retauleu2.setGasto_fisico(453);
       retauleu2.setDistancia(24);
       grafos.get(2).setNodo(retauleu2);
       
       NodoGrafo retauleu3 =new NodoGrafo();
       retauleu3.setOrigen("Quetzaltenango");
       retauleu3.setDestino("Retauleu3");
       retauleu3.setTiempo_promedio_vehiculo(24);
       retauleu3.setTiempo_aproximado_a_pie(42);
       retauleu3.setGasto_gasolna(24);
       retauleu3.setGasto_fisico(453);
       retauleu3.setDistancia(24);
       retauleu3.setNodo(new Grafo());
       retauleu3.getNodo().setValor(retauleu3.getDestino());
       retauleu3.getNodo().setNodos(new ArrayList<>());
       retauleu3.getNodo().setNodo(santamaria);
       grafos.get(2).setNodo(retauleu3);
       
       NodoGrafo retauleu4 =new NodoGrafo();
       retauleu4.setOrigen("Quetzaltenango");
       retauleu4.setDestino("Retauleu4");
       retauleu4.setTiempo_promedio_vehiculo(24);
       retauleu4.setTiempo_aproximado_a_pie(42);
       retauleu4.setGasto_gasolna(24);
       retauleu4.setGasto_fisico(453);
       retauleu4.setDistancia(24);
       retauleu4.setNodo(new Grafo());
       retauleu4.getNodo().setValor(retauleu4.getDestino());
       retauleu4.getNodo().setNodos(new ArrayList<>());
       retauleu4.getNodo().setNodo(santamaria);
       grafos.get(2).setNodo(retauleu4);
       
       grafos.get(2).imprimirNodos();
        int t = 3;
        ArbolB arbolB = new ArbolB(t);
        int[] valoresUno = {20, 10, 50, 30, 40};
        System.out.println("-- INICIO --");
        System.out.println("INSERTANDO VALORES AL ARBOL B");
        for(int i=0; i<valoresUno.length; i++) {
            arbolB.insertar(valoresUno[i],grafos.get(1).getNodos());
           
        }
        arbolB.showBTree();
       
        System.out.println("\nBuscando el nodo con el valor 80 en el arbol B:");
        arbolB.buscarNodoPorClave(80);
        
        //IMPLEMENTAR
        System.out.println("\nEl valor maximo del arbol B es : " + arbolB.buscarClaveMayor());
        
        System.out.print("El nodo minimo de la raiz del arbol B es :");
        arbolB.mostrarClavesNodoMinimo();
        
        System.out.println("");
        System.out.println("-- FIN --");*/
       
    }
}
