package Ejercicios.Ejercicio1;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio1Swich {
    /**
     * Escribe un programa que pida por teclado un día de la semana y que diga qué
     * asignatura toca a primera hora ese día.
     */
    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo String (Caracter)
        String diaSemana, asignaturaPrimeraHora;


        //Bucle tipo do while se repite hasta que se cumple la condición
        do {
            //Inicio

            //Imprime por pantalla
            System.out.print("Por favor, introduce un día de la semana o pulse \"0\" para salir: ");
            //Leer por teclado
            diaSemana = quitarAcentos(teclado.nextLine().toLowerCase()); //// Convierte el texto ingresado a minúsculas para evitar problemas de mayúsculas/minúsculas
            //Condición del if igualamos la vraible número==0, para cuando pulsemos 0 salga del bucle

            //Dejamos la variable vacía
            asignaturaPrimeraHora = "";
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (diaSemana) {
                case "lunes":
                    asignaturaPrimeraHora = "Contornos";
                    break;
                case "martes":
                    asignaturaPrimeraHora = "Sistemas Informáticos";
                    break;
                case "miercoles":
                    asignaturaPrimeraHora = "Base de Datos";
                    break;
                case "jueves":
                    asignaturaPrimeraHora = "Programación ";
                    break;
                case "viernes":
                    asignaturaPrimeraHora = "Sistemas Informáticos";
                    break;
                case "sabado":
                    asignaturaPrimeraHora = "No hay clase";
                    break;
                case "Domingo":
                    asignaturaPrimeraHora = "No hay clase";
                    break;
                default:
                    asignaturaPrimeraHora = "Día no válido.";
                    break;
            }
            //Imprime por pantalla
            System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de " + asignaturaPrimeraHora + ".");

        } while (!diaSemana.equals("0"));
        System.out.println("Fin del programa");
        //Fin
    }

    // Función para quitar acentos de una cadena de texto
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
