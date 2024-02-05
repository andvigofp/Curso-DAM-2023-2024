import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se
     * solicitarán al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de
     * calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).
     * Ejemplo :
     * Nota del primer trimestre 4
     * Nota del segundo trimestre 5
     * Nota del tercer trimestre 6
     * Boletín de calificaciones: 5
     * Expediente académico: 5.0
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo entero
        int notaPrimer, notaSegun, notaTercer;
        //variable tipo double
        double media;

        System.out.println("Nota del primer trimestre: ");
        notaPrimer = teclado.nextInt();

        System.out.println("Nota del segundo trimestre: ");
        notaSegun = teclado.nextInt();

        System.out.println("Nota del tercer trimestre: ");
        notaTercer = teclado.nextInt();

        //Calcular la nota media
        media = (notaPrimer + notaSegun + notaTercer) /3.0;
        // //Mostrar la nota media en formato de boletín de calificaciones (parte entera)
        System.out.println("Boletín de calificaciones: " + Math.round(media));
        //Mostrar la nota media en formato de expediente académico (con decimales)
        System.out.println("Expediente académico: " + media);
    }
}
