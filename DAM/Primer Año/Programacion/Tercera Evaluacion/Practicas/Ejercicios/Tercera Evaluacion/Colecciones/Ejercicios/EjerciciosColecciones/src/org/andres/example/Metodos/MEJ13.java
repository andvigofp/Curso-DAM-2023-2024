package org.andres.example.Metodos;

import org.andres.example.Modelo.Articulo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MEJ13 {
    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("\nGESTISIMAL - GESTIÓN SIMPLIFICADA DE ALMACÉN");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Venta");
        System.out.println("7. Salir");
    }
    // Método para mostrar el listado de todos los articulos
    public static void listarArticulos(List<Articulo> almacen) {
        System.out.println("\nListado de artículos:");
        if (almacen.isEmpty()) {
            System.out.println("El almacén está vacío.");
        } else {
            for (Articulo articulo : almacen) {
                System.out.println(articulo.getCodigo() + " - " + articulo.getDescripcion() +
                        " - Stock: " + articulo.getStock());
            }
        }
    }

    //Método para agreagar un árticulo
    public static void altaArticulo(List<Articulo> almacen, Scanner teclado) {
        System.out.println("\nAlta de artículo:");
        int codigo = leerEntero("Introduce el código del artículo: ", teclado);
        if (buscarArticulo(almacen, codigo) != null) {
            System.out.println("Error: Ya existe un artículo con ese código.");
            return;
        }
        String descripcion = leerCadena("Introduce la descripción del artículo: ", teclado);
        double precioCompra = leerDouble("Introduce el precio de compra del artículo: ", teclado);
        double precioVenta = leerDouble("Introduce el precio de venta del artículo: ", teclado);
        int stock = leerEntero("Introduce el stock del artículo: ", teclado);
        almacen.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
        System.out.println("Artículo dado de alta correctamente.");
    }
    //Método para dar de baja un árticulo médiante código del articulo

    public static void bajaArticulo(List<Articulo> almacen, Scanner teclado) {
        System.out.println("\nBaja de artículo:");
        int codigo = leerEntero("Introduce el código del artículo a dar de baja: ", teclado);
        Articulo articulo = buscarArticulo(almacen, codigo);
        if (articulo != null) {
            almacen.remove(articulo);
            System.out.println("Artículo dado de baja correctamente.");
        } else {
            System.out.println("Error: No existe un artículo con ese código.");
        }
    }

    public static void modificarArticulo(List<Articulo> almacen, Scanner teclado) {
        System.out.println("\nModificación de artículo:");
        int codigo = leerEntero("Introduce el código del artículo a modificar: ", teclado);
        Articulo articulo = buscarArticulo(almacen, codigo);
        if (articulo != null) {
            System.out.println("Artículo encontrado:");
            System.out.println("Código: " + articulo.getCodigo());
            System.out.println("Descripción: " + articulo.getDescripcion());
            System.out.println("Precio de compra: " + articulo.getPrecioCompra());
            System.out.println("Precio de venta: " + articulo.getPrecioVenta());
            System.out.println("Stock: " + articulo.getStock());
            String descripcion = leerCadena("Introduce la nueva descripción del artículo (dejar vacío para mantener): ", teclado);
            if (!descripcion.isEmpty()) {
                articulo.setDescripcion(descripcion);
            }
            double precioCompra = leerDouble("Introduce el nuevo precio de compra del artículo (0 para mantener): ", teclado);
            if (precioCompra != 0) {
                articulo.setPrecioCompra(precioCompra);
            }
            double precioVenta = leerDouble("Introduce el nuevo precio de venta del artículo (0 para mantener): ", teclado);
            if (precioVenta != 0) {
                articulo.setPrecioVenta(precioVenta);
            }
            int stock = leerEntero("Introduce el nuevo stock del artículo (0 para mantener): ", teclado);
            if (stock != 0) {
                articulo.setStock(stock);
            }
            System.out.println("Artículo modificado correctamente.");
        } else {
            System.out.println("Error: No existe un artículo con ese código.");
        }
    }

    public static void entradaMercancia(List<Articulo> almacen, Scanner teclado) {
        System.out.println("\nEntrada de mercancía:");
        int codigo = leerEntero("Introduce el código del artículo: ", teclado);
        Articulo articulo = buscarArticulo(almacen, codigo);

        if (articulo != null) {
            int cantidad = leerEntero("Introduce la cantidad de mercancía a ingresar: ", teclado);
            articulo.setStock(articulo.getStock() + cantidad);
            System.out.println("Entrada de mercancía realizada correctamente.");
        } else {
            System.out.println("Error: No existe un artículo con ese código.");
        }
    }

    public static void salidaMercancia(List<Articulo> almacen, Scanner teclado) {
        System.out.println("\nVenta:");
        int codigo = leerEntero("Introduce el código del artículo: ", teclado);
        Articulo articulo = buscarArticulo(almacen, codigo);

        if (articulo != null) {
            int cantidad = leerEntero("Introduce la cantidad de mercancía a vender: ", teclado);

            if (cantidad <= articulo.getStock()) {
                articulo.setStock(articulo.getStock() - cantidad);
                double totalVenta = articulo.getPrecioVenta() * cantidad;
                double iva = totalVenta * 0.21;
                double totalConIva = totalVenta + iva;
                System.out.println("Venta realizada correctamente.");
                System.out.println("Total venta: " + totalVenta + " €");
                System.out.println("IVA (21%): " + iva + " €");
                System.out.println("Total con IVA: " + totalConIva + " €");
            } else {
                System.out.println("Error: No hay suficiente stock para realizar la venta.");
            }
        } else {
            System.out.println("Error: No existe un artículo con ese código.");
        }
    }

    public static Articulo buscarArticulo(List<Articulo> almacen, int codigo) {
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
    }

    public static int leerEntero(String mensaje, Scanner teclado) {
        int valor = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(mensaje);
                valor = teclado.nextInt();
                teclado.nextLine(); // Consumir el salto de línea
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero.");
                teclado.nextLine(); // Limpiar el buffer
            }
        } while (!entradaCorrecta);
        return valor;
    }

    public static double leerDouble(String mensaje, Scanner scanner) {
        double valor = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(mensaje);
                valor = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número decimal.");
                scanner.nextLine(); // Limpiar el buffer
            }
        } while (!entradaCorrecta);
        return valor;
    }

    public static String leerCadena(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}