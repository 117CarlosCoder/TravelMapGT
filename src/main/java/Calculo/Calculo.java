/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author carlosl
 */
public class Calculo {
    
    private static double rapidezVehiculo ;
    private static double rapidezCaminando ;

    
    public Calculo() {
    }
    
    public static double calcularRapidezVehiculo(double distancia, double tiempo, double trafico) {
        return rapidezVehiculo = distancia /(tiempo*(1+trafico));
    }
    
    public static double calcularRapidezCaminando(double distancia, double tiempo) {
        return rapidezCaminando = distancia /tiempo;
    }

    public static double getRapidezVehiculo() {
        return rapidezVehiculo;
    }

    public static void setRapidezVehiculo(double rapidezVehiculo) {
        Calculo.rapidezVehiculo = rapidezVehiculo;
    }

    public static double getRapidezCaminando() {
        return rapidezCaminando;
    }

    public static void setRapidezCaminando(double rapidezCaminando) {
        Calculo.rapidezCaminando = rapidezCaminando;
    }
    
    
}
