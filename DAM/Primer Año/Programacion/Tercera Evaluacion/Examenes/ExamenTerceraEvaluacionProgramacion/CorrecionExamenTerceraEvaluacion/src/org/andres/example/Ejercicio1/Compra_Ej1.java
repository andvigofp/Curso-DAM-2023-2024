package org.andres.example.Ejercicio1;

public class Compra_Ej1 {
    private String producto;
    private double precio;
    private int cantidad;

    public Compra_Ej1() {
    }

    public Compra_Ej1(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Compra_Ej1{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
