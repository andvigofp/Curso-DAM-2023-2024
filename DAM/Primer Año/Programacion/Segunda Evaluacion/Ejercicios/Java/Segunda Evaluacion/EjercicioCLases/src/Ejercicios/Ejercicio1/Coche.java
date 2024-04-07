package Ejercicios.Ejercicio1;

import java.util.StringJoiner;

public class Coche extends Vehiculo{
    private String modelo;
    private int depositvo;
    private String color;
    public Coche(int kilometrosRecorridos, String modelo, int depositvo, String color) {
        super( kilometrosRecorridos);
        this.modelo=modelo;
        this.depositvo=depositvo;
        this.color=color;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDepositvo() {
        return depositvo;
    }

    public void setDepositvo(int depositvo) {
        this.depositvo = depositvo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void quemarRuerda() {
        System.out.println("!Quemando rueda, casí  no te queda rueda!");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Coche.class.getSimpleName() + "[", "]")
                .add("modelo='" + modelo + "'")
                .add("depositvo='" + depositvo + "'")
                .add("color='" + color + "'")
                .toString();
    }
}
