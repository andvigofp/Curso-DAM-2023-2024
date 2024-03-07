package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class Menu {
    //Método menú de opciones
    public static void menuOpciones() {
        System.out.println("VEHÍCULOS\n"+
                "------------------\n"+
                "-------------------\n" +
                "1. Anda con la bicicleta\n"+
                "2. Haz el caballito con la bicicleta\n"+
                "3. Anda con el coche\n" +
                "4. Quema rueda con el coche\n" +
                "5. Ver kilometraje de la bicicleta\n" +
                "6. Ver kilométraje del coche\n" +
                "7. Ver kilometraje total\n" +
                "8. Salir\n" +
                "Elige una opción (1-8)");



    }

    //Método para pedir por teclado
    public static Scanner pedirTeclado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuátos km avanza");
        return teclado;
    }



}
