/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficar;


import ArbolB.ArbolB;
import Grafo.Grafo;
import Grafo.NodoGrafo;
import guru.nidi.graphviz.attribute.Rank;
import guru.nidi.graphviz.attribute.Records;
import static guru.nidi.graphviz.attribute.Records.rec;
import static guru.nidi.graphviz.attribute.Records.turn;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import static guru.nidi.graphviz.model.Compass.*;
import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;
import static guru.nidi.graphviz.model.Factory.to;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeGenerator {

    public static void main(String[] args) throws IOException {
         MutableGraph g = mutGraph("example3").setDirected(true);

         List<String> dataList = new ArrayList<>();
        // Aquí agregas tus datos a la lista, por ejemplo:
        dataList.add("node0:f0:f1:f2:f3:f4");
        dataList.add("node1:n4:v:719:");
        dataList.add("node2:a1:805:p:");
        dataList.add("node3:i9:718:");
        dataList.add("node4:e5:989:p:");
        dataList.add("node5:t2:v:959:");
        dataList.add("node6:o1:794:");
        dataList.add("node7:s7:659:");

        
        // Iterar sobre la lista de datos y agregar nodos al grafo
        for (String data : dataList) {
            String[] parts = data.split(":");
            String nodeName = parts[0];
            MutableNode node = mutNode(nodeName).add(Records.of(turn(rec(parts[1]))));
            g.add(node);
        }

        // Agregar relaciones entre nodos
        for (String data : dataList) {
            String[] parts = data.split(":");
            String nodeName = parts[0];
            for (int i = 4; i < parts.length; i++) {
                String[] linkParts = parts[i].split(",");
                if (linkParts.length >= 2) {
                    String targetNodeName = linkParts[0];
                    g.addLink(mutNode(nodeName).addLink(to(mutNode(targetNodeName).port(WEST))));
                }
            }
        }
         
       /*  List<String> dataList = new ArrayList<>();
        // Aquí agregas tus datos a la lista, por ejemplo:
        dataList.add("0:f1:f2:f3:f4");
        dataList.add("n4:v:719:");
        dataList.add("805:p:");
        dataList.add("i9:718:");
        dataList.add("e5:989:p:");
        dataList.add("t2:v:959:");
        dataList.add("o1:794:");
        dataList.add("s7:659:");
        for (int j = 0; j < dataList.size(); j++){
            
            MutableNode node = mutNode("node"+j).add(Records.of(turn(rec(dataList.get(0)), rec(dataList.get(1)), rec(dataList.get(2)))));
            g.add(node);
        }*/
        // Agregar nodos
        /*
        MutableNode node0 = mutNode("node0").add(Records.of(rec("f0", ""), rec("f1", ""), rec("f2", ""), rec("f3", ""), rec("f4", "")));
        MutableNode node1 = mutNode("node1").add(Records.of(turn(rec("n4"), rec("v", "719"), rec(""))));
        MutableNode node2 = mutNode("node2").add(Records.of(turn(rec("a1"), rec("805"), rec("p", ""))));
        MutableNode node3 = mutNode("node3").add(Records.of(turn(rec("i9"), rec("718"), rec(""))));
        MutableNode node4 = mutNode("node4").add(Records.of(turn(rec("e5"), rec("989"), rec("p", ""))));
        MutableNode node5 = mutNode("node5").add(Records.of(turn(rec("t2"), rec("v", "959"), rec(""))));
        MutableNode node6 = mutNode("node6").add(Records.of(turn(rec("o1"), rec("794"), rec(""))));
        MutableNode node7 = mutNode("node7").add(Records.of(turn(rec("s7"), rec("659"), rec(""))));
*/
        // Agregar nodos al grafo
       // g.add(node0, node1, node2, node3, node4, node5, node6, node7);

        // Agregar relaciones entre nodos
        /*for (int j = 0; j < dataList.size(); j++){
            if (dataList.size()-1 == j) {
                g.addLink(mutNode("node"+j).addLink(to(mutNode("node"+(4)).port(WEST))));
            }
            else{
            g.addLink(mutNode("node"+j).addLink(to(mutNode("node"+j+1).port(WEST))));
            }
        }  */
        /*
        g.addLink(node0.addLink(to(node1.port("v", SOUTH))),
                   node0.addLink(to(node2.port(WEST))),
                   node0.addLink(to(node3.port(WEST))),
                   node0.addLink(to(node4.port(WEST))),
                   node0.addLink(to(node5.port("v", NORTH))),
                   node2.addLink(to(node6.port(NORTH_WEST))),
                   node4.addLink(to(node7.port(SOUTH_WEST))));
*/
        // Configurar estilo del grafo
        g.graphAttrs().add(Rank.dir(Rank.RankDir.LEFT_TO_RIGHT));

        System.out.println(g);
        
        // Renderizar el grafo y guardar en un archivo PNG
        Graphviz.fromGraph(g).width(900).render(Format.PNG).toFile(new File("/home/carlosl/NetBeansProjects/TravelMapGT/src/main/java/Graficar/arbozl.png"));
    }
}







