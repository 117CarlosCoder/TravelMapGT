/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import guru.nidi.graphviz.attribute.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author carlosl
 */
public class NodoGrafo {
    private String Origen;
    private String Destino;
    private double tiempo_promedio_vehiculo;
    private double tiempo_aproximado_a_pie;
    private double gasto_gasolna;
    private double gasto_fisico;
    private double distancia;
    private DateTimeFormatter formatter;
    private LocalTime horaInicial;
    private LocalTime horaFinal;
    private Color Color;
    private double puntuacio;
    private float probabilidadTrafico;
    private Grafo nodo;

    public NodoGrafo() {
        this.Color = Color.BLACK;
        this.formatter = DateTimeFormatter.ofPattern("HH");
        
    }

    public NodoGrafo(String Origen, String Destino, double tiempo_promedio_vehiculo, double tiempo_aproximado_a_pie, double gasto_gasolna, double gasto_fisico, double distancia, Grafo nodo) {
        this.Color = Color.BLACK;
        this.formatter = DateTimeFormatter.ofPattern("HH");
        this.Origen = Origen;
        this.Destino = Destino;
        this.tiempo_promedio_vehiculo = tiempo_promedio_vehiculo;
        this.tiempo_aproximado_a_pie = tiempo_aproximado_a_pie;
        this.gasto_gasolna = gasto_gasolna;
        this.gasto_fisico = gasto_fisico;
        this.distancia = distancia;
        this.nodo = nodo;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public double getTiempo_promedio_vehiculo() {
        return tiempo_promedio_vehiculo;
    }

    public void setTiempo_promedio_vehiculo(int tiempo_promedio_vehiculo) {
        this.tiempo_promedio_vehiculo = tiempo_promedio_vehiculo;
    }

    public double getTiempo_aproximado_a_pie() {
        return tiempo_aproximado_a_pie;
    }

    public void setTiempo_aproximado_a_pie(int tiempo_aproximado_a_pie) {
        this.tiempo_aproximado_a_pie = tiempo_aproximado_a_pie;
    }

    public double getGasto_gasolna() {
        return gasto_gasolna;
    }

    public void setGasto_gasolna(int gasto_gasolna) {
        this.gasto_gasolna = gasto_gasolna;
    }

    public double getGasto_fisico() {
        return gasto_fisico;
    }

    public void setGasto_fisico(int gasto_fisico) {
        this.gasto_fisico = gasto_fisico;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Grafo getNodo() {
        return nodo;
    }

    public void setNodo(Grafo nodo) {
        this.nodo = nodo;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }
    
    

    public void setHoraInicial(String horaInicial1) {
        if(horaInicial1.length()>1){
            formatter = DateTimeFormatter.ofPattern("HH");
        }
        else{
            formatter = DateTimeFormatter.ofPattern("H");
        }
        LocalTime hora = LocalTime.parse(horaInicial1, formatter); 
        this.horaInicial = hora;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal1) {
        if(horaFinal1.length()>1){
            formatter = DateTimeFormatter.ofPattern("HH");
        }
        else{
            formatter = DateTimeFormatter.ofPattern("H");
        }
        LocalTime hora = LocalTime.parse(horaFinal1, formatter); 
        this.horaFinal = hora;
    }

    
    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public double getProbabilidadTrafico() {
        return probabilidadTrafico;
    }

    public void setProbabilidadTrafico(float probabilidadTrafico) {
        this.probabilidadTrafico = probabilidadTrafico;
    }

    @Override
    public String toString() {
        return "NodoGrafo{" + "Origen=" + Origen + ", Destino=" + Destino + ", tiempo_promedio_vehiculo=" + tiempo_promedio_vehiculo + ", tiempo_aproximado_a_pie=" + tiempo_aproximado_a_pie + ", gasto_gasolna=" + gasto_gasolna + ", gasto_fisico=" + gasto_fisico + ", distancia=" + distancia + ", formatter=" + formatter + ", horaInicial=" + horaInicial + ", horaFinal=" + horaFinal + ", Color=" + Color + ", puntuacio=" + puntuacio + ", probabilidadTrafico=" + probabilidadTrafico + ", nodo=" + nodo + '}';
    }

    public String destinos() {
        return " " + Destino  + " ";
    }
    
    
}
