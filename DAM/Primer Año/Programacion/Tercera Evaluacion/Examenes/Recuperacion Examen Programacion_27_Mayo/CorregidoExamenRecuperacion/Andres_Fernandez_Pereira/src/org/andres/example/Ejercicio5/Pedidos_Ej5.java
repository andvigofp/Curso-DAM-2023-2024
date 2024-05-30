package org.andres.example.Ejercicio5;

public class Pedidos_Ej5 {
    private String nombre;
    private double precio;
    private int unidades;
    private double subtotal;

    public Pedidos_Ej5() {
    }

    public Pedidos_Ej5(String nombre, double precio, int unidades, double subtotal) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return nombre + " PVP " + precio + " Unidades: " + unidades + " Subtotal: " + subtotal;
    }
}
