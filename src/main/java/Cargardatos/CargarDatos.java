/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cargardatos;

import Grafo.Grafo;
import Grafo.NodoGrafo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlosl
 */
public class CargarDatos {
    private static List<Grafo> listadoGrados;
    
    public CargarDatos(){}
    
    public static void main(String[] args) {
        File file = new File("/home/carlosl/NetBeansProjects/TravelMapGT/src/main/java/Cargardatos/input_example.csv");
        List<Grafo> grafos = leerCSVDatos(file);
        Graficar.Graficar.generarGraficosListado(grafos);
    }
    

public static List<Grafo> leerCSVDatos(File Valor) {
     //String csvFile = "/home/carlosl/NetBeansProjects/TravelMapGT/src/main/java/Cargardatos/input_example.csv";
        String line = "";
        String cvsSplitBy = "\\|"; 
        listadoGrados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Valor))) {
            while ((line = br.readLine()) != null) {

                boolean encontrado = false;                
                String[] datos = line.split(cvsSplitBy);
                Grafo grafo = new Grafo(datos[0], new ArrayList<>());
                
                for (Grafo grafox : listadoGrados) {
                        System.out.println("Valor agregado " + datos[0]);
                         System.out.println("Valor agregado " + datos[1]);
                         System.out.println("Valor origen actual " + grafox.getValor());
                        if (datos[0].equals(grafox.getValor())) {
                            System.out.println("Mismo origen");
                            NodoGrafo nodoGrafox = new NodoGrafo();
                            nodoGrafox.setOrigen(datos[0]);
                            nodoGrafox.setDestino(datos[1]);
                            nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                            nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                            nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                            nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                            nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                            nodoGrafox.setNodo(new Grafo(datos[0],new ArrayList<>()));
                            grafox.setNodo(nodoGrafox);
                            
                            

                            encontrado = true;
                            

                        }
                        /*else if (grafox.getValor().equals(datos[1])) {
                            System.out.println("Mismo origen con destino");
                            NodoGrafo nodoGrafox = new NodoGrafo();
                            nodoGrafox.setOrigen(datos[0]);
                            nodoGrafox.setDestino(datos[1]);
                            nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                            nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                            nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                            nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                            nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                            nodoGrafox.setNodo(grafox);
                            
                            //nodoGrafox.getNodo().setNodo(nodoGrafo);
                            encontrado = true;
                            System.out.println("");
                            System.out.println("Valores lista  actuales");
                            System.out.println("[");
                            for (Grafo listadoGrado : listadoGrados) {

                                System.out.println(listadoGrado.getValor());
                            }
                            System.out.println("]");
                            //if (nodoGrafo.getNodo() != null) {
                              //  if (!nodoGrafo.getNodo().getNodos().isEmpty()) {
                                //    encontrado = agregarEnSubgrafos(nodoGrafo.getNodo(), datos, nodoGrafo);                                
                                //}
                            //}


                        }*/
                    else{
                        /*else if (nodoGrafo.getNodo() != null) {
                            encontrado = agregarSubgrafos(nodoGrafo.getNodo(), datos);
                            break;
                        }*/
                            for (NodoGrafo nodoGrafo : grafox.getNodos()) {
                                /*if (datos[0].equals(nodoGrafo.getOrigen())) {
                                    System.out.println("Origen y Orignen iguales");
                                    NodoGrafo nodoGrafox = new NodoGrafo();
                                    nodoGrafox.setOrigen(datos[0]);
                                    nodoGrafox.setDestino(datos[1]);
                                    nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                                    nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                                    nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                                    nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                                    nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                                    nodoGrafox.setNodo(new Grafo(datos[0],new ArrayList<>()));
                                    nodoGrafo.getNodo().setNodo(nodoGrafox);
                                    if (nodoGrafo.getNodo() != null) {
                                        if (!nodoGrafo.getNodo().getNodos().isEmpty()) {
                                                    encontrado = agregarEnSubgrafos(grafox, datos, nodoGrafox);                                
                                        }
                                    }
                                }*/
                               /* if (datos[0].equals(nodoGrafo.getDestino())) {
                                    System.out.println("Origen y destino iguales");
                                    NodoGrafo nodoGrafox = new NodoGrafo();
                                    nodoGrafox.setOrigen(datos[0]);
                                    nodoGrafox.setDestino(datos[1]);
                                    nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                                    nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                                    nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                                    nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                                    nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                                    nodoGrafox.setNodo(new Grafo(datos[0],new ArrayList<>()));
                                    nodoGrafo.getNodo().setNodo(nodoGrafox);}*/
                                    
                                    encontrado = agregarSubgrafos(grafox, datos);                                
                                    
                                
                            }

                            if (encontrado) {
                                break;
                            }
                        }
                }
                
                

                System.out.println("Encontrado : " + encontrado);

                if (!encontrado) {

                    NodoGrafo nodoGrafo = new NodoGrafo();
                    nodoGrafo.setOrigen(datos[0]);
                    nodoGrafo.setDestino(datos[1]);
                    nodoGrafo.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                    nodoGrafo.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                    nodoGrafo.setGasto_gasolna(Integer.parseInt(datos[4]));
                    nodoGrafo.setGasto_fisico(Integer.parseInt(datos[5]));
                    nodoGrafo.setDistancia(Integer.parseInt(datos[6]));
                    nodoGrafo.setNodo(new Grafo(datos[0],new ArrayList<>()));
                    grafo.setNodo(nodoGrafo);

                   
                      boolean encontra = false;
                        for (int i = 0; i < listadoGrados.size(); i++) {
                            if (listadoGrados.get(i).getValor().equals(nodoGrafo.getOrigen())) {
                                encontra = true;
                                break;
                            }
                        }

                        if (!encontra) {
                            listadoGrados.add(grafo);
                        }

                    if (listadoGrados.isEmpty()) {
                        listadoGrados.add(grafo);
                    }

                }

                }
        } catch (IOException e) {
            e.printStackTrace();
        }

         System.out.println("Listado Grafo : " + listadoGrados);
        for (Grafo listadoGrado : listadoGrados) {
            System.out.println("Grafos : "+ listadoGrado.getValor());
            System.out.println("[");
            for (NodoGrafo nodo : listadoGrado.getNodos()) {             
                    nodo.toString();
                    if (nodo.getNodo() != null) {
                        mostrarGrafos(nodo.getNodo());
                    }
                    
                }
             System.out.println("]");
            }
        
                
             return listadoGrados;
        }

public static void leerCSVTrafico(File Valor) {
     //String csvFile = "/home/carlosl/NetBeansProjects/TravelMapGT/src/main/java/Cargardatos/data_traffic.csv";
        String line = "";
        String cvsSplitBy = "\\|"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(Valor))) {
            while ((line = br.readLine()) != null) {
                 String[] datos = line.split(cvsSplitBy);
                 for (Grafo grafo : listadoGrados) {
                     for (NodoGrafo nodoGrafo  : grafo.getNodos()) {
                         System.out.println("valor " + nodoGrafo.getDestino());
                         if (nodoGrafo.getOrigen().equals(datos[0]) && nodoGrafo.getDestino().equals(datos[1])) {
                             System.out.println("Cambio");
                             nodoGrafo.setHoraInicial(datos[2]);
                             nodoGrafo.setHoraFinal(datos[3]);
                             double valor =  Integer.parseInt(datos[4]);
                             float probabilidad = (float) (valor/100);
                             System.out.println("valor int " + Integer.valueOf(datos[4]));
                             System.out.println("Valor string "+ datos[4]);
                             System.out.println("Probabilidad : "+ probabilidad);
                             nodoGrafo.setProbabilidadTrafico(probabilidad);
                         }
                     }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargarDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CargarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Grafo listadoGrado : listadoGrados) {
            System.out.println("Grafos : "+ listadoGrado.getValor());
            System.out.println("[");
            for (NodoGrafo nodo : listadoGrado.getNodos()) {             
                   System.out.println( nodo.toString());
                    if (nodo.getNodo() != null) {
                        mostrarGrafos(nodo.getNodo());
                    }
                    
                }
             System.out.println("]");
            }
        
        
}

        public static void mostrarGrafos(Grafo grafo) {
            for (NodoGrafo nodox : grafo.getNodos()) {             
                    System.out.println( nodox.toString());
                    if (nodox.getNodo() != null) {
                        mostrarGrafos(nodox.getNodo());
                    }
            }
        }
        
        public static boolean agregarSubgrafos(Grafo grafo, String[] datos) {
            boolean encontrado = false;
                    for (NodoGrafo nodoGrafo : grafo.getNodos()) {
                        if (datos[0].equals(nodoGrafo.getOrigen())) {
                            NodoGrafo nodoGrafox = new NodoGrafo();
                            nodoGrafox.setOrigen(datos[0]);
                            nodoGrafox.setDestino(datos[1]);
                            nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                            nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                            nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                            nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                            nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                            nodoGrafox.setNodo(new Grafo(datos[0],new ArrayList<>()));
                            grafo.setNodo(nodoGrafox);
                            encontrado = true;
                           /* if(nodoGrafo.getNodo() != null){
                                if (!nodoGrafo.getNodo().getNodos().isEmpty()) {
                                    encontrado = agregarSubgrafos(nodoGrafo.getNodo(), datos);                                
                                }
                            }*/
                        }
                       /* else if (datos[0].equals(nodoGrafo.getDestino())) {
                            NodoGrafo nodoGrafox = new NodoGrafo();
                            nodoGrafox.setOrigen(datos[0]);
                            nodoGrafox.setDestino(datos[1]);
                            nodoGrafox.setTiempo_promedio_vehiculo(Integer.parseInt(datos[2]));
                            nodoGrafox.setTiempo_aproximado_a_pie(Integer.parseInt(datos[3]));
                            nodoGrafox.setGasto_gasolna(Integer.parseInt(datos[4]));
                            nodoGrafox.setGasto_fisico(Integer.parseInt(datos[5]));
                            nodoGrafox.setDistancia(Integer.parseInt(datos[6]));
                            nodoGrafox.setNodo(new Grafo(datos[0],new ArrayList<>()));
                            nodoGrafox.getNodo().setNodo(nodoGrafo);
                            encontrado = true;
                             //if(nodoGrafo.getNodo() != null){
                                //if (!nodoGrafo.getNodo().getNodos().isEmpty()) {
                                 //   encontrado = agregarSubgrafos(nodoGrafo.getNodo(), datos);                                
                               // }
                           // }
                        }*/
                         else  if(nodoGrafo.getNodo() != null){
                            agregarSubgrafos(nodoGrafo.getNodo(), datos);
                        }
                    }
            return encontrado;
        }
         public static boolean agregarEnSubgrafos(Grafo grafo, String[] datos, NodoGrafo nodoGrafox) {
             boolean encontrado = false;
                    System.out.println();
                    System.out.println("Agragar en grafos Origen " + grafo.getValor());
                    System.out.println("Agragar en grafos lista de grafos " + grafo.getNodos());
                    System.out.println("Nodos " );
                    System.out.println("[" );
                    for (NodoGrafo nodo : grafo.getNodos()) {
                        System.out.println("Origen " + nodo.getOrigen());
                        System.out.println("Destino "+ nodo.getDestino());
                    }
                    System.out.println("]" );
                    System.out.println();
                    for (NodoGrafo nodoGrafo : grafo.getNodos()) {
                        if (datos[0].equals(nodoGrafo.getOrigen())) {
                            if(!nodoGrafo.getNodo().getNodos().contains(nodoGrafox)){
                                nodoGrafo.getNodo().setNodo(nodoGrafox);   
                                System.out.println("Agregando nodo origen " + nodoGrafox.getOrigen());
                                System.out.println("Agregando nodo destino " + nodoGrafox.getDestino());
                                encontrado = true;
                            }
                            
                        }
                        else if (datos[0].equals(nodoGrafox.getDestino())) {
                            if(!nodoGrafox.getNodo().getNodos().contains(nodoGrafo)){
                                nodoGrafox.getNodo().setNodo(nodoGrafo);
                                encontrado = true;
                                System.out.println("Agregando nodo origen " + nodoGrafo.getOrigen());
                                System.out.println("Agregando nodo destino " + nodoGrafo.getDestino());
                            }
                        }
                        /*else  if(nodoGrafo.getNodo() != null ){
                           if (!nodoGrafo.getNodo().getNodos().isEmpty()) {
                                   agregarEnSubgrafos(nodoGrafo.getNodo(), datos, nodoGrafox);                                
                           }
                           
                        }*/
                    }
                    
            return encontrado;
         }
 
        public static NodoGrafo argegarNodo() {
             return null;
        }
         
}
