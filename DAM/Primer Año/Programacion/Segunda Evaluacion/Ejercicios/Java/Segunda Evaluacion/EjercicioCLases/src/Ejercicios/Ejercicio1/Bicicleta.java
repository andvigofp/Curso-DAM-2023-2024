package Ejercicios.Ejercicio1;

import java.util.Scanner;
import java.util.StringJoiner;

public class Bicicleta extends Vehiculo{
    private String modelo;
    private int clicilindrada;
    private Vehiculo vehiculo;

    public Bicicleta( int kilometrosRecorridos, String modelo, int clicilindrada) {
        super( kilometrosRecorridos);
        this.modelo=modelo;
        this.clicilindrada=clicilindrada;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getClicilindrada() {
        return clicilindrada;
    }

    public void setClicilindrada(int clicilindrada) {
        this.clicilindrada = clicilindrada;
    }


    public void hacerCaballido() {
        System.out.println("!La bicileta está haciendo el caballito");
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", Bicicleta.class.getSimpleName() + "[", "]")
                .add("modelo='" + modelo + "'")
                .add("clicilindrada=" + clicilindrada)
                .toString();
    }
}
