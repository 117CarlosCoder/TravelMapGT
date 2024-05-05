/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listado;

import Grafo.Grafo;
import Grafo.NodoGrafo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlosl
 */
public class Listado {
    public static List<Grafo> generarListado() {
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
       retauleu.setNodo(new Grafo("Retauleu", new ArrayList<>()));
        

       
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
       retauleu.getNodo().setNodo(quetzaltenango);
       
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
      
       //Graficar.generarGraficosListado(grafos);
       return grafos;
    }
}
