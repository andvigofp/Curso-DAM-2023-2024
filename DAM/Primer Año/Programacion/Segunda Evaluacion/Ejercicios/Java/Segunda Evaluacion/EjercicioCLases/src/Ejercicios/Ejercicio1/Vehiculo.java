package Ejercicios.Ejercicio1;

import java.util.Scanner;
import java.util.StringJoiner;

public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    private int kilometrosRecorridos;

    public Vehiculo( int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculosCreados++;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void andar(int km) {
       if (km <0) {
           km = km *-1;
       }
       this.kilometrosRecorridos +=km;
       kilometrosTotales +=km;

        System.out.println("Kilometros introducidos correctamente." + km);
    }

    public void verKilometrajeRecorrido() {
        System.out.println("El véhiculo ha recorrido un total de  " + getKilometrosRecorridos() + "Km.");
    }

    public  void verKilometraTotal() {
        System.out.println("La cantidad kílometros recooridos " + getKilometrosTotales() + " km.");
    }
}