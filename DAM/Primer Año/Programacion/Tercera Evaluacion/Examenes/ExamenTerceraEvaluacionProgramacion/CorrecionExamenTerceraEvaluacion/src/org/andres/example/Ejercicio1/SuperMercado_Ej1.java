package org.andres.example.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperMercado_Ej1 {
    private Map<String, Double> productos;
    private ArrayList<Compra_Ej1> compras;

    public SuperMercado_Ej1() {
        productos = new HashMap<>();
        compras = new ArrayList<>();
        inicializarProductos();
    }
    //Método para inializar sus productos y precio mediante HasMap
    private void inicializarProductos() {
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
    }

    //Método para realizar la compra
    public void realizarCompra() {
        Scanner teclado = new Scanner(System.in);
        String producto;
        int cantidad;

        while (true) {
            System.out.print("Producto: ");
            producto = teclado.nextLine().toLowerCase();
            if (producto.equals("fin")) {
                break;
            }
            System.out.print("Cantidad: ");
            cantidad = Integer.parseInt(teclado.nextLine());

            if (productos.containsKey(producto)) {
                compras.add(new Compra_Ej1(producto, productos.get(producto), cantidad));
            } else {
                System.out.println("Producto no disponible.");
            }
        }
        teclado.close();
    }

    //Método Para mostar el resultado
    public void mostrarResultados() {
        double total = 0;
        System.out.println("Producto \tPrecio \tCantidad \tSubtotal");
        System.out.println("---------------------------------------------------------");
        for (Compra_Ej1 compra : compras) {
            double subtotal = compra.getPrecio() * compra.getCantidad();
            total += subtotal;
            System.out.printf("%s \t\t%.2f \t%d \t\t%.2f\n", compra.getProducto(), compra.getPrecio(), compra.getCantidad(), subtotal);
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("TOTAL: \t\t\t\t%.2f\n", total);
    }


}