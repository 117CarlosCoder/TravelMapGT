/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficar;

import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.Node;
import static guru.nidi.graphviz.model.Factory.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArbolGRahp {
    public void crearGrafo(List<String> registros) throws IOException {
        Graph g = graph("arbol").directed().graphAttr().with(Rank.dir(Rank.RankDir.LEFT_TO_RIGHT));
        for (String registro : registros) {
            Node n = node(registro);
            g = g.with(n);
        }
        Graphviz.fromGraph(g).width(900).render(Format.PNG).toFile(new File("/home/carlosl/NetBeansProjects/TravelMapGT/src/main/java/Graficar/arbol.png"));
    }
    public static void main(String[] args) {
        List<String> registros = Arrays.asList("nodo1", "nodo2", "nodo3", "nodo4", "nodo5");
        ArbolGRahp arbol = new ArbolGRahp();
        try {
            arbol.crearGrafo(registros);
        } catch (IOException ex) {
            Logger.getLogger(ArbolGRahp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
