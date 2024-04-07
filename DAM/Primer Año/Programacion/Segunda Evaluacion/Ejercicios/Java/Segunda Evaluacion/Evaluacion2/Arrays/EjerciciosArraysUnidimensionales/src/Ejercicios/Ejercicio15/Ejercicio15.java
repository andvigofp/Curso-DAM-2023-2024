package Ejercicios.Ejercicio15;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    /**
     * Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una
     * mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena). Cuando llega un cliente se le
     * pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a
     * 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
     * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de
     * nuevo”.
     * Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
     * libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas,
     * se podrá colocar donde haya una o dos personas. Inicialmente, las mesas se cargan con valores
     * aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes se debe mostrar el estado de las
     * mesas. Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El funcionamiento
     * del programa se ilustra a continuación:
     * <p>
     * Ejemplo:
     * <p>
     * |Mesa nº|  1| 2| 3| 4| 5| 6| 7| 8| 9| 10|
     * <p>
     * |Ocupaión| 3| 2| 0| 2| 4| 1| 0| 2| 1| 1|
     * <p>
     * ¿Cuántos son? (Introduzca -1 para salir del programa): 2. Por favor, siéntense en la mesa número 3.
     * <p>
     * |Mesa nº|  1| 2| 3| 4| 5| 6| 7| 8| 9| 10|
     * <p>
     * |Ocupaión| 3| 2| 0| 2| 4| 1| 0| 2| 1| 1|
     * <p>
     * ¿Cuántos son? (Introduzca -1 para salir del programa): 2 Por favor, siéntense en la mesa número 3
     * <p>
     * |Mesa nº|  1| 2| 3| 4| 5| 6| 7| 8| 9| 10|
     * <p>
     * |Ocupaión| 3| 2| 0| 2| 4| 1| 0| 2| 1| 1|
     * <p>
     * ¿Cuántos son? (Introduzca -1 para salir del programa): 2 Por favor, siéntense en la mesa número 3
     * <p>
     * |Mesa nº|  1| 2| 3| 4| 5| 6| 7| 8| 9| 10|
     * <p>
     * |Ocupaión| 3| 2| 0| 2| 4| 1| 0| 2| 1| 1|
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        //Inicialización del estado de las mesas con valores aleatorios entre 0 y 4
        int estadoMeasas[] = MetodosEj15.inicializarEstadoMesas(random);
        
        // Mostrar el estado inicial de las mesas
        System.out.println("Estado inicial de las mesas:");
        MetodosEj15.mostrarEstadoMesas(estadoMeasas);

        // Ejecutar el bucle principal para recibir nuevos clientes
        MetodosEj15.atenderClientes(teclado, estadoMeasas);

    }


}