/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficar;

import Grafo.Grafo;
import Grafo.NodoGrafo;
import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Font;
import guru.nidi.graphviz.attribute.Rank;
import static guru.nidi.graphviz.attribute.Rank.RankDir.LEFT_TO_RIGHT;
import static guru.nidi.graphviz.model.Factory.node;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import static guru.nidi.graphviz.model.Factory.graph;
import guru.nidi.graphviz.model.Graph;

/**
 *
 * @author carlosl
 */
public class Graficar {

    
   
    public static void generarGraficos(Grafo grafo) {
       List<Graph> listadoDeGRafos= new ArrayList<>();
       graficar(listadoDeGRafos,grafo,grafo.getValor());
       
       
       Graph finalGraph = graph().directed()
            .graphAttr().with(Rank.dir(LEFT_TO_RIGHT));

        for (Graph graph : listadoDeGRafos) {
            finalGraph = finalGraph.with(graph);
        }
        
        try {
            Graphviz.fromGraph(finalGraph).height(200).render(Format.PNG).toFile(new File("src/main/java/Graficar/graficaGenerada.png"));
            System.out.println("Grafos renderizados y unidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al renderizar y unir los grafos: " + e.getMessage());
        }
        
    }
    
    
    
    public static void generarGraficosListado(List<Grafo> grafos) {
       List<Graph> listadoDeGRafos= new ArrayList<>();
        for (Grafo grafo : grafos) {
            graficar(listadoDeGRafos,grafo,grafo.getValor());
        }
       
       Graph finalGraph = graph().directed()
            .graphAttr().with(Rank.dir(LEFT_TO_RIGHT));

        for (Graph graph : listadoDeGRafos) {
            finalGraph = finalGraph.with(graph);
        }
        
        try {
            Graphviz.fromGraph(finalGraph).width(1000).render(Format.PNG).toFile(new File("src/main/java/Graficar/graficaGenerada.png"));
            System.out.println("Grafos renderizados y unidos correctamente.");
        } catch (IOException e) {
            System.out.println("Error al renderizar y unir los grafos: " + e.getMessage());
        }
        
    }
    
     public static void graficar(List<Graph> listadoDeGrafos, Grafo grafo, String nodoPadre) {
        System.out.println("Grafos : " + grafo.getNodos() );
        if (grafo.getNodos() != null) {
            for (NodoGrafo nodoGrafo : grafo.getNodos()) {
                System.out.println("Nodo : " + nodoGrafo.getDestino());
                if (nodoGrafo.getNodo() != null && !(nodoGrafo.getNodo().getNodos().isEmpty())) {
                    listadoDeGrafos.add(createGraph(nodoPadre + "_" + nodoGrafo.getNodo().getValor(), nodoPadre, nodoGrafo.getNodo().getValor()));

                    graficar(listadoDeGrafos, nodoGrafo.getNodo(), nodoGrafo.getNodo().getValor());
                } else {
                    listadoDeGrafos.add(createGraph(nodoPadre + "_" + nodoGrafo.getDestino(), nodoPadre, nodoGrafo.getDestino()));
                }
            }
        }
        
    }

    
    public static Graph createGraph(String name, String node1, String node2) {
        return graph(name).directed()
                .graphAttr().with(Rank.dir(LEFT_TO_RIGHT))
                .nodeAttr().with(Font.name("Liberation Sans"))
                .linkAttr().with("class", "link-class")
                .with(
                        node(node1).with(Color.BLACK).link(node(node2))
                );
    }
    


   

    public static void main(String[] args) {
        // Ejemplo de uso
    }

    
}
