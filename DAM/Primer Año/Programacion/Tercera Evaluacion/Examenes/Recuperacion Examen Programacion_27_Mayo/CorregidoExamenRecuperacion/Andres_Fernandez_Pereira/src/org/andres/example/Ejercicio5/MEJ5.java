package org.andres.example.Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class MEJ5 {
    //Método para mostar un menú de opciones
    public static void Mostrarmenu() {
        System.out.println("\nMenú de Gestión productos Fitosanitarios");
        System.out.println("1. Agregar productos Fitosanitarios");
        System.out.println("2. Mostrar todos productos");
        System.out.println("3. Mostrar Número elementos del pedido");
        System.out.println("4. Importe total");
        System.out.println("5. Mostar resumen compra");
        System.out.println("6. Salir");
        System.out.println("Elige de una opciones entre 1-4 (6 para salir)");

    }

    //Método para agregar la lista productos fisonitarios
    public static void aggregarProductos(ArrayList<Pedidos_Ej5> pedidos, Scanner teclado) {
        System.out.println("Introduzca nombre del producto");
        String nombre = teclado.nextLine();

        if (buscarProducto(pedidos, nombre)!=null) {
            System.out.println("Error: ya existe ese producto, se incrementará la cantidad");
            return;
        }

        System.out.println("Intoduzca el precio del pédido");
        double precio = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduzca la cantidad de unidades");
        int unidades = teclado.nextInt();
        teclado.nextLine();


        System.out.println("El subtotal ");
        double subtotal = precio * unidades;
        System.out.println(subtotal);

        pedidos.add(new Pedidos_Ej5(nombre, precio, unidades, subtotal));
        System.out.println("Se creado la lista de correctamente de productos sanitarios");

    }




    //Método para listar todos los productos
    public static void listarTodosProductos(ArrayList<Pedidos_Ej5> pedidos) {
        for (Pedidos_Ej5 p: pedidos) {
            System.out.println(p);
        }
    }
    //Método para mostrar total productos comprado
    public static void mostarCantidadPedidos(ArrayList<Pedidos_Ej5> pedidos) {
            System.out.println("En tu pedido tiene " + pedidos.size() + " productos");


    }

    //Método para mostrar el importe total
    public static void mostrarImportetotal(ArrayList<Pedidos_Ej5> pedidos) {
        double total = 0;
        for (Pedidos_Ej5 p : pedidos) {
           total += p.getSubtotal();
        }
        System.out.println("El total del pedido es de " + total + " €");

    }
    //Método para mostrar el resumen de la compra
    public static void mostrarResumen(ArrayList<Pedidos_Ej5> pedidos) {
        for (Pedidos_Ej5 p: pedidos) {
            System.out.println(p);
        }
        mostarCantidadPedidos(pedidos);

        mostrarImportetotal(pedidos);
    }


    //Método para comborbar si existe el producto solo le incrementamos la cantidad;
    private static Pedidos_Ej5 buscarProducto(ArrayList<Pedidos_Ej5> pedidos, String nombre) {

        double unidades=1;
        for (Pedidos_Ej5 p: pedidos) {

            if (p.getNombre().equals(nombre)) {
                p.setUnidades((int) (p.getUnidades() + unidades));
                System.out.println("Se ha incrementado la cantidad de unidades " + p.getUnidades());
                return p;
            }
        }
        return null;
    }



    }

