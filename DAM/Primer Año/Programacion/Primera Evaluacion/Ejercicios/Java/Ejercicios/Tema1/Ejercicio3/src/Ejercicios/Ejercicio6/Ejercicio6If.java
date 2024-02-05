package Ejercicios.Ejercicio6;

import javax.swing.text.html.Option;
import java.util.Scanner;

public class Ejercicio6If {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo double
        double g,altura, tiempo;
        g = 9.81; //Aceleración debido a la gravedad en m/s^2
        //Varaibale tipo String(Caracter)
        String continuar;
        //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
        do {
            //inicio
            //imprime por pantalla
            System.out.println("Introduzca la altura desde la que caerá el objeto (en metros): ");
            //Leer por teclado
            altura = teclado.nextDouble();
            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición
            if (altura==0) {
                System.out.println("Saliendo del programa");
                break;
            }else if (altura<0) {
                System.out.println("La altura no puede ser negativa.");
            }
            //Operaciones
            tiempo = Math.sqrt((2*altura)/g);
            //Imprime por pantalla el resultado
            System.out.println("El tiempo que tardará en caer el objeto desde una altura de " + altura + " metros es de " + tiempo + " segundos.");
            //imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        }while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
    }
}
