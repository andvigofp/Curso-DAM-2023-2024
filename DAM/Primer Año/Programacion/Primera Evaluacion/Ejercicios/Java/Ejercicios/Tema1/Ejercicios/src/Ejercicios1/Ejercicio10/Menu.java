package Ejercicios1.Ejercicio10;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Variable tipo entero
        int opciones;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Utilizamos en el bucle do while que recorre todo el moemento y vuelava al menú de opciones
        //No saldra del bucle hasta que pulsemos 5 para salir
       //Inicio
        do {
            //Hacemos un menú de opcines, para después iutilizar todos los casos en swich
            System.out.println("Elija una opción:");
            System.out.println("1: Númerós entre 1 y 100 con  while:");
            System.out.println("2: Números entre 1 y 100 con do while:");
            System.out.println("3: Números entre 1 y 100 con for:");
            System.out.println("4: Generando números aleatorios con for");
            System.out.println("5: Pulse 5 para salir");
            System.out.println("Opciones: ");
            opciones = teclado.nextInt();
            //Utilizamos el switch para hacer todos los casos necesarios
            switch (opciones) {
                case 1:
                    NumeroUno_CienWhile.NumeroWhile();
                    break;
                case 2:
                    NumeroUno_CienDoWhile.NumeroDoWhile();
                    break;
                case 3:
                    NumeroUno_CienFor.NumeroFor();
                    break;
                case 4:
                    NumeoAleatoriosUno_Cien.NumeroAleatorio();
                    break;
                case 5:
                    System.out.println("Salio correctamente: ");
                    break;
                default:
                    System.out.println("Error Opción no válido. Pon uno de las opciones entre 1 y 5");
            }
        }while (opciones !=5);

    }
    //Fin


}
