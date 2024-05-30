package org.andres.example.Examen.Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. En esta
 * primera versión del programa se tendrán en cuenta los productos que se indican en la tabla junto con su precio.
 * Los productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que indicar el producto y el número
 * de unidades que se compran, por ejemplo “guisantes” si se quiere comprar un bote de guisantes y la cantidad,
 * por ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra “fin”. Suponemos que el
 * usuario no va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los nombres y
 * precios de los productos y una o varias listas para almacenar la compra que realiza el usuario.
 * A continuación se muestra una tabla con los productos disponibles y sus respectivos precios:
 * Avena Garbanzos Tomate Jengibre Quinoa Guisantes
 * 2,21 2,39 1,59 3,13 4,5 1,60
 * Entrada de datos por teclado:
 * Ejemplo:
 * Producto: tomate
 * Cantidad: 1
 * Producto: quinoa
 * Cantidad: 2
 * Producto: avena
 * Cantidad: 1
 * Producto: tomate
 * Cantidad: 2
 * Producto: fin
 *
 * Salida obtenida:
 *
 * 		Producto  Precio  Cantidad  Subtotal
 * 		------------------------------------
 * 		tomate    1,59      1         1,59
 *
 * 		quinoa 	  4,50 	    2 	      9,00
 *
 * 		avena     2,21      1         2,21
 *
 * 		tomate    1,59      2         3,18
 *
 * 		------------------------------------
 *
 * TOTAL: 15,98
 */
public class Supermercado_EJ1 {
    //Colleciones productos tipo diciconario, lista de productos y cantidades ArrayList
    private HashMap<String, Double> productos;
    private ArrayList<String> listaProductos;
    private ArrayList<Integer> listaCantidades;

    //Constructor la calse supermercado, va el dicccionario de productos y precio
    public Supermercado_EJ1() {
        productos = new HashMap<>();

        productos.put("avena", 2.21);
        productos.put("garbanzos",2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre",3.13);
        productos.put("quinoa",4.50);
        productos.put("guisantes",1.60);

        listaProductos = new ArrayList<>();
        listaCantidades = new ArrayList<>();
    }

    //Método para mostar los productos con su preico original
    public void mostrarPrpductos() {
        System.out.println("Productos disponibles y sus precios:");
        System.out.println("------------------------------------");
        for (String producto : productos.keySet()) {
            double precio = productos.get(producto);
            System.out.printf("%-10s %.2f%n", producto, precio);
        }
        System.out.println("------------------------------------");
    }

    //Método para realziar la compra
    public void realizarCompra() {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Producto: ");
            String producto = teclado.nextLine().toLowerCase();

            if (producto.equals("fin")) {
                break;
            }

            System.out.println("Cantidad");
            int cantidad = Integer.parseInt(teclado.nextLine());

            if (productos.containsKey(producto)) {
                listaProductos.add(producto);
                listaCantidades.add(cantidad);
            }else {
                System.out.println("Producto no disponible.");
            }
        }
    }

    //Método para mostrar el resumen de la compra con su precio, cantidad, subtotal  (precio * cantidad).
    //El total de la compra realizada es la suma total + subtotal
    public void mostrarResumen() {
        double total = 0.0;
        System.out.println("\nProducto precio cantidad Subtotal");
        System.out.println("----------------------------------");

        for (int i=0; i<listaProductos.size(); i++) {
            String producto = listaProductos.get(i);
            int cantidad = listaCantidades.get(i);
            double precio = productos.get(producto);
            double subtotal = precio * cantidad;
            total +=subtotal;
            System.out.printf("%-10s %-7.2f %-9d %.2f%n", producto, precio, cantidad, subtotal);
        }

        System.out.println("----------------------------------");
        System.out.printf("TOTAL: %.2f%n", total);
    }
}
