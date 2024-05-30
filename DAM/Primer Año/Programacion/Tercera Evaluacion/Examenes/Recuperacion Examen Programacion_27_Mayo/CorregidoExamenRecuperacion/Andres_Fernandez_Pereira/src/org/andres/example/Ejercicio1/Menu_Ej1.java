package org.andres.example.Ejercicio1;

import java.util.Scanner;

public class Menu_Ej1 {
    //Método Menú de opciones
    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        TiendaRespuestoAutomovil_Ej1 tienda = new TiendaRespuestoAutomovil_Ej1();
        int opciones;

        do {
            TiendaRespuestoAutomovil_Ej1.Mostrarmenu();

            opciones = teclado.nextInt();
            teclado.nextLine();

            switch (opciones) {
                case 1:
                    tienda.agregarRespuesto(teclado);
                    break;
                case 2:
                    tienda.mostrarProductos();
                    break;
                case 3:
                    tienda.darBajaPrducto(teclado);
                    break;
                case 4:
                    tienda.incrementarStock(teclado);
                    break;
                case 5:
                    tienda.guardarInventario();
                    break;
                case 6:
                    System.out.println("Fin del programa..");
                    break;
                default:
                    System.out.println("Error: no has elegido la opción correcta");
            }
        }while (opciones !=6);
    }
}

