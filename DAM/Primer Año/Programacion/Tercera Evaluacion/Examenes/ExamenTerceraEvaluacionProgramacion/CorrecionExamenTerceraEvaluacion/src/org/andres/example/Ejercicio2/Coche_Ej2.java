package org.andres.example.Ejercicio2;

public class Coche_Ej2 {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;

    public Coche_Ej2() {
    }

    public Coche_Ej2(String matricula, String marca, String modelo, int kilometros) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Kilómetros: " + kilometros;
    }
}
