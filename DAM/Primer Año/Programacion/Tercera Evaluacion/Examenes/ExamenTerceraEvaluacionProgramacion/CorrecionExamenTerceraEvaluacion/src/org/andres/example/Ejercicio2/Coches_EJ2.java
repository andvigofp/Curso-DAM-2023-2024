package org.andres.example.Examen.Ejercicio2;

/**
 * Crea una clase coche que tenga como atributos del tipo que tú consideres más adecuado: matrícula,
 * marca,modelo y kilómetros. Y a continuación realiza el siguiente ejercicio:
 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche. El programa pide por teclado los
 * datos de los coches y los guarda en el array. A continuación, utilizará el ArrayList para mostrar por pantalla los
 * siguientes métodos:
 * a) Todos los coches introducidos.
 * b) Todos los coches de una marca determinada que el usuario pedirá por teclado
 * c) Todos los coches con menos de un número determinado de Kilómetros que el usuario escribirá.
 * d) El coche con mayor número de Kilómetros.
 * e) Todos los coches ordenados por número de kilómetros de menor a mayor
 */
public class Coches_EJ2 {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;

    public Coches_EJ2() {
    }

    public Coches_EJ2(String matricula, String marca, String modelo, int kilometros) {
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometros=" + kilometros +
                '}';
    }
}
