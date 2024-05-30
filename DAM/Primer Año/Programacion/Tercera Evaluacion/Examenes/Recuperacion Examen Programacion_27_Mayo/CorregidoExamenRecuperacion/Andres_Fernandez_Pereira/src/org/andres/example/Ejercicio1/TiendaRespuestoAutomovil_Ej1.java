package org.andres.example.Ejercicio1;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaRespuestoAutomovil_Ej1 {
    private HashMap<String, Integer> productos;


    //Constructo de la clase TiendaRespuestoAutomovil, va con el diccionario de su nombre y id;
    public TiendaRespuestoAutomovil_Ej1() {
        productos = new HashMap<>();

        productos.put("A123", 10);
        productos.put("A456", 20);
        productos.put("8456", 5);
        productos.put("C789", 15);


    }

    //Método para mostar un menú de opciones
    public static void Mostrarmenu() {
        System.out.println("\nMenú de Gestión de respuesto tienda oches");
        System.out.println("1. Alta respuesto de coches");
        System.out.println("2. Mostrar todos productos de los respuestos");
        System.out.println("3. Dar de baja un producto ");
        System.out.println("4. Incrementar Stock");
        System.out.println("5. Guradar Fichero");
        System.out.println("6 Salir");
        System.out.println("Elige de una opciones entre 1-5 (6 para salir)");
    }

    //Método para mostar todos los productos
    public void mostrarProductos() {
        System.out.println("Productos dispinibles");
        System.out.println("--------------------------------");
        for (String producto : productos.keySet()) {
            int id = productos.get(producto);

            System.out.println(producto + " " + id);
        }
        System.out.println("----------------------------------");
    }

    //Método para por si encuentra un producto dubplicado
    public void addProdcto(String id, int cantidad) {
        productos.merge(id, cantidad, Integer::sum);
    }

    //Método para agregar un producto
    public void agregarRespuesto(Scanner teclado) {
        System.out.println("Introduzca el nombre del producto");
        String id = teclado.nextLine();

        System.out.println("Introduzca la cantidad de productos");
        int cantidad = Integer.parseInt(teclado.nextLine());


        addProdcto(id, cantidad);
        System.out.println("Se ha añadido a la lista correctamente");
    }

    //Método para dar de baja un producto
    public void darBajaPrducto(Scanner teclado) {

        System.out.println("id: ");
        String id = teclado.next();
        productos.remove(id);
        System.out.println("El producto se eliminado correctamente");


    }
    //Método para actualizar la cantidad del stock del procuto
    public void incrementarStock(Scanner teclado) {

        System.out.print("Ingrese el código del producto: ");
        String id = teclado.next();
        System.out.print("Ingrese la nueva cantidad: ");
        int cantidad = teclado.nextInt();

        if (productos.containsKey(id)) {
            productos.put(id,cantidad);
            System.out.println("Se ha actualizado la nueva cantidad");
        }else {
            System.out.println("Producto no encotrado");
        }
    }
    //Método para guradr el inventario  ficehro
    public void guardarInventario()  {
        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("inventario.txt"))){
            escribir.writeObject(productos);
            System.out.println("Se ha gurado el fichero");
        } catch (IOException e) {
            System.out.println("Error de escribir el fichero "+ e.getMessage());
        }

    }
    }



