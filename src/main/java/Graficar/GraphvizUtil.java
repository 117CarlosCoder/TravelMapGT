/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficar;

import com.google.common.collect.ImmutableList;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.stream.file.FileSinkImages;
import org.graphstream.stream.file.FileSinkImages.OutputType;
import org.graphstream.stream.file.images.Resolution;
import org.graphstream.stream.file.images.Resolutions;
import org.graphstream.ui.view.camera.Camera;

public class GraphvizUtil {

    private static final String DEFAULT_RANKDIR = "LR"; // Left to right ranking

    public static String generateGraphviz(String graphName, Iterable<Iterable<String>> nodes) {
        StringBuilder dot = new StringBuilder();

        dot.append("digraph ").append(graphName).append(" {\n");
        dot.append("  rankdir=" + DEFAULT_RANKDIR + ";\n");

        // Define nodes with labels
        int nodeId = 0;
        for (Iterable<String> nodeData : nodes) {
            dot.append("  node").append(nodeId).append(" [label=\"");
            dot.append(StringUtils.join(nodeData, "\\n")); // Escape newlines in labels
            dot.append("\"];\n");
            nodeId++;
        }

        // Connect nodes based on indexes (assuming specific relationships)
        int sourceIndex = 0;
        for (Iterable<String> sourceNode : nodes) {
            int targetIndex = sourceIndex + 1;
            if (targetIndex < nodeId) {
                dot.append("  node").append(sourceIndex).append(" -> node").append(targetIndex).append(";\n");
            }
            sourceIndex++;
        }

        dot.append("}\n");

        return dot.toString();
    }
    
    public static void generateAndSaveGraph(String graphName, Iterable<Iterable<String>> nodes) {
        Graph graph = new SingleGraph(graphName);

        // Add nodes with labels
        int nodeId = 0;
        for (Iterable<String> nodeData : nodes) {
            graph.addNode("node" + nodeId).setAttribute("ui.label", String.join("\\n", nodeData));
            nodeId++;
        }

        // Connect nodes based on indexes (assuming specific relationships)
        for (int i = 0; i < nodeId - 1; i++) {
            graph.addEdge("edge" + i + "-" + (i + 1), "node" + i, "node" + (i + 1));
        }

        // Save the graph as an image
       try {
            FileSinkImages pic = new FileSinkImages(OutputType.PNG, Resolutions.HD720) {
                @Override
                protected Camera getCamera() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                protected void render() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                protected BufferedImage getRenderedImage() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                protected void initImage() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                protected void clearImage(int i) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            pic.setLayoutPolicy(FileSinkImages.LayoutPolicy.COMPUTED_FULLY_AT_NEW_IMAGE);
            pic.setQuality(FileSinkImages.Quality.HIGH);
            pic.setAutofit(false);
            pic.writeAll(graph, "target/" + graphName + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



   public static void main(String[] args) {
    // Set the UI package
    System.setProperty("org.graphstream.ui", "swing");

    Iterable<Iterable<String>> sampleNodes = ImmutableList.of(
            ImmutableList.of("f0", "f1", "f2", "f3", "f4"),
            ImmutableList.of("n4", "v:719"),
            ImmutableList.of("a1", "805", "p:"),
            ImmutableList.of("i9", "718"),
            ImmutableList.of("e5", "989", "p:"),
            ImmutableList.of("t2", "v:959"),
            ImmutableList.of("o1", "794"),
            ImmutableList.of("s7", "659")
    );

    String graphName = "example3";
    generateAndSaveGraph(graphName, sampleNodes);
}

}
