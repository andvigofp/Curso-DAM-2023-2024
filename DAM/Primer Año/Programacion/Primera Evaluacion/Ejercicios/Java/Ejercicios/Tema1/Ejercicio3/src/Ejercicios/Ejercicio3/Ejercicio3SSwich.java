package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3SSwich {
    /**
     * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        //Salia por pantalla
        Scanner teclado = new Scanner(System.in);
        //Variable tipo String(Caracter)
        String contniuar, nombreDia;
        //Variable tipo Entero
        int numeroDia;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprime por pantalla
            System.out.print("Por favor, introduce un número del 1 al 7: ");
            //Leer por teclado
            numeroDia = teclado.nextInt();
            //Condición del if igualamos la vraible número==0, para cuando pulsemos 0 salga del bucle
            if (numeroDia == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }
            //LO dejamos vacía para no tener problemas
            nombreDia = "";
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (numeroDia) {
                case 1:
                    nombreDia = "Lunes";
                    break;
                case 2:
                    nombreDia = "Martes";
                    break;
                case 3:
                    nombreDia = "Miércoles";
                    break;
                case 4:
                    nombreDia = "Jueves";
                    break;
                case 5:
                    nombreDia = "Viernes";
                    break;
                case 6:
                    nombreDia = "Sábado";
                    break;
                case 7:
                    nombreDia = "Domingo";
                    break;
                default:
                    //imprime por pantalla
                    System.out.println("Número no válido. Debe ser un número del 1 al 7.");
                    break;
            }
            //Imprime por pantalla el resultado
            System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
            //Imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            contniuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!contniuar.equals("0"));
        //Imprime por pantalla
        System.out.println("A salido correctamente");
        //Fin
    }
}
