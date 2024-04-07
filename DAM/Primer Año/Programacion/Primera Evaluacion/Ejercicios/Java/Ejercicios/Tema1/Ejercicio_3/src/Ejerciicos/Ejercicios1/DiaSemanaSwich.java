package Ejerciicos.Ejercicios1;

import java.text.Normalizer;
import java.util.Scanner;



public class DiaSemanaSwich {
    /**
     * Escribe un programa que pida por teclado un día de la semana y que diga qué
     * asignatura toca a primera hora ese día.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables t
        String diaSemana, asignatura;

        System.out.println("Por favor introduce un día de la semana: ");
       //diaSemana = quitarAcentos(teclado.nextLine().toLowerCase());
        diaSemana = teclado.nextLine().toLowerCase()
                .replaceAll("[áäâà]", "a")
                .replaceAll("[éëêè]", "e")
                .replaceAll("[íïîì]", "i")
                .replaceAll("[óöôò]", "o")
                .replaceAll("[úüûù]", "u");
        //Condición del Swich
        switch (diaSemana) {
            case "lunes":
                asignatura = "Contornos";
                break;
            case "martes":
                asignatura = "Sistemas Informáticos";
                break;
            case "miercoles":
                asignatura = "Base de Datos";
                break;
            case "jueves":
                asignatura = "Programación ";
                break;
            case "viernes":
                asignatura = "Sistemas Informáticos";
                break;
            case "sabado":
                asignatura = "No hay clase";
                break;
            case "Domingo":
                asignatura = "No hay clase";
                break;
            default:
                asignatura = "Día no válido.";
                break;
        }

        System.out.println("El día " + diaSemana + " a primera hora tienes la asignatura de " + asignatura + ".");
    }
    //Función para quitar los acentós
    /**public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }*/
}
