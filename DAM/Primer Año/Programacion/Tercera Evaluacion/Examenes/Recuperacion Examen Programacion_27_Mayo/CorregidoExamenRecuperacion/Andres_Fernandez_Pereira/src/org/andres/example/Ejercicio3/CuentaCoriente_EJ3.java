package org.andres.example.Ejercicio3;

public class CuentaCoriente_EJ3 {
    private String dni;
    private String nombre;
    private String apelillos;
    private double saldo;

    public CuentaCoriente_EJ3() {
    }

    public CuentaCoriente_EJ3(String dni, String nombre, String apelillos, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelillos = apelillos;
        this.saldo = saldo;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelillos() {
        return apelillos;
    }

    public void setApelillos(String apelillos) {
        this.apelillos = apelillos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "DNI: "+ dni +" Nombre: "  + nombre + " Apellidos: " + apelillos + " Saldo: " + saldo;
    }
}
