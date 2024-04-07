package Ejerciicos.Ejercicios1;

import java.text.Normalizer;
import java.util.Scanner;

public class DiaSemanaIf {
    /**
     * Escribe un programa que pida por teclado un día de la semana y que diga qué
     * asignatura toca a primera hora ese día.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables tipo String
        String diaSemana, asignatura;
        //Imprime por pantalla
        System.out.println("Por favor, introduce un día de la semana");
        //diaSemana = quitarAcentos(teclado.nextLine().toLowerCase());
        //Para convertir minusculas/Mayusculas y quitarlosAcentos
        diaSemana = teclado.nextLine().toLowerCase()
                .replaceAll("[áäâà]", "a")
                .replaceAll("[éëêè]", "e")
                .replaceAll("[íïîì]", "i")
                .replaceAll("[óöôò]", "o")
                .replaceAll("[úüûù]", "u");
        //Condición del Si
        if (diaSemana.equals("lunes")) {
            asignatura = "Contornos";
        } else if (diaSemana.equals("martes")) {
            asignatura = "Sistemas Informático";
        } else if (diaSemana.equals("miercoles")) {
            asignatura = "Base de datos";
        } else if (diaSemana.equals("jueves")) {
            asignatura = "Programación";
        } else if (diaSemana.equals("viernes")) {
            asignatura = "Sistemas Informático";
        }else if(diaSemana.equals("sabado")) {
            asignatura = "No hay clase";
        }else if (diaSemana.equals("domingo")) {
            asignatura = "no hay clase";
        } else {
            asignatura = "Día no válido.";
        }
        System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de: " + asignatura + ".");
    }
    //Fin

    //Funcíon para quitar Acentos
	/**public static String quitarAcentos(String input) {
        // Reemplazar caracteres con tilde o diacríticos comunes en español
        String output = input.replaceAll("[áäâà]", "a")
                .replaceAll("[éëêè]", "e")
                .replaceAll("[íïîì]", "i")
                .replaceAll("[óöôò]", "o")
                .replaceAll("[úüûù]", "u");

        // También se pueden agregar más reglas según las necesidades

        return output;
    }**/
}
