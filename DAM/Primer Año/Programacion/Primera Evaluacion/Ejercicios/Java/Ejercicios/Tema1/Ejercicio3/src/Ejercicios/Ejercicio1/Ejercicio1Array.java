package Ejercicios.Ejercicio1;

import java.util.Scanner;
import java.text.Normalizer;

public class Ejercicio1Array {
    /**
     * Escribe un programa que pida por teclado un día de la semana y que diga qué
     * asignatura toca a primera hora ese día.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Array tipo String para los días y asignaturas, lo recorremos por la posición 0 hasta 7
        String[] diasSemana = {"lunes", "martes","miercoles", "jueves", "viernes", "Sábado", "Domingo"};
        String[] asignaturasPrimeraHora = {"Contornos", "Sistemas Informáticos", "Base de Datos", "Programación", "Sistemas Informáticos", "No hay clase", "No hay clase"};

        //Variable tipo entero
        int indiceDia;
        indiceDia = -1;
        //Variable tipo String
        String diaSemana;

        //Bucle do while se repite hasta que se cumpla la condición, saldra hasta que pulse 0 para salir del bucle
        do {
            //Inicio

            //Imprime por pantalla
            System.out.print("Por favor, introduce un día de la semana o pulse \"0\" para salir: ");
            // Convierte el texto ingresado a minúsculas para evitar problemas de mayúsculas/minúsculas
            diaSemana = quitarAcentos(teclado.nextLine().toLowerCase());



            //Recorremos el Array con un bucle For
            for (int i = 0; i < diasSemana.length; i++) {
                if (diaSemana.equals(diasSemana[i])) {
                    indiceDia = i;
                    break;
                }

            }
            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición
            if (indiceDia != -1) {
                //Imprime por pantalla
                System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de: " + asignaturasPrimeraHora[indiceDia] + ".");
            } else {
                System.out.println("Día no válido.");
            }

        } while (!diaSemana.equals("0"));
        System.out.println("Fin del programa");
        //Fin

    }

    // Método para quitar acentos de una cadena de texto
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}

