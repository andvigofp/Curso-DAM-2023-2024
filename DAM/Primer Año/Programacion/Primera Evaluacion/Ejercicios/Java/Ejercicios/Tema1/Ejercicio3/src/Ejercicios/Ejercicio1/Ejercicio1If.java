package Ejercicios.Ejercicio1;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio1If {
    /**
     * Escribe un programa que pida por teclado un día de la semana y que diga qué
     * asignatura toca a primera hora ese día.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //variable tipo String (Caracter)
        String diaSemana,asignaturaPrimeraHora,continuar;
        //Bucle do wile se repite, hasta que se cumpla la condición
        do {
            //Inicio

            //Imprime por pantalla
            System.out.print("Por favor, introduce un día de la semana o pulse \"0\" para salir: ");
            //Leer por teclado
            diaSemana = quitarAcentos(teclado.nextLine().toLowerCase()); // Convierte a minúsculas para evitar problemas de mayúsculas/minúsculas
            //Utilizamos .equals para hacer una cmparaión, para cuando pulsemos 0 salga del bucle
            if (diaSemana.equals("0")) {
                System.out.println("Salido correctamente");
                break;
            }
            //Dejamos la variable vacía
            asignaturaPrimeraHora = "";

            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición
            if (diaSemana.equals("lunes")) {
                asignaturaPrimeraHora = "Contornos";
            } else if (diaSemana.equals("martes")) {
                asignaturaPrimeraHora = "Sistemas Informático";
            } else if (diaSemana.equals("miercoles")) {
                asignaturaPrimeraHora = "Base de datos";
            } else if (diaSemana.equals("jueves")) {
                asignaturaPrimeraHora = "Programación";
            } else if (diaSemana.equals("viernes")) {
                asignaturaPrimeraHora = "Sistemas Informático";
            }else if(diaSemana.equals("sabado")) {
                asignaturaPrimeraHora = "No hay clase";
            }else if (diaSemana.equals("domingo")) {
                asignaturaPrimeraHora = "no hay clase";
            } else if (diaSemana.equals("0")) {
                System.out.println("A salido correctamente");
                break; // Salir del bucle si se ingresa "0"
            } else {
                asignaturaPrimeraHora = "Día no válido.";
            }
            //Imprime por pantalla el resultado
            System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de: " + asignaturaPrimeraHora + ".");

        } while (true);
    }
    //Fin

    //Función para poder quitar los acéntos
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}