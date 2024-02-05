package Ejercicios2.Ejercicio2;

import java.util.Scanner;

public class CalcularCircuferenciaArea {
    public static void CircuferenciaArea() {
        /**
         * Escriba un pseucódigo que pida por teclado el radio de una circuferencia, y que a continuación
         * calcule y escriba en  pantalla la longitud de la circuferencia y del área del círculo
         */
        //Variables tipo double
        double radio, longitudCircuferencia, areaCirculo;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        //Utilizamos el bucle do while, para que se repita el ciclo hasta que pulsemos 0 para salir
        do {
            System.out.println("Introduce el radio de la circuferencia: (Pulsa 0 Para salir) ");
            radio = teclado.nextDouble();
            //Utilizamos la varible radio !(distinto) =0 para despúes salir cuando puslemos 0
            if (radio !=0) {
                //Operaciones para calcular longitidCircufrenecia y areaCírculo
                    longitudCircuferencia = 2 * Math.PI * radio;
                    areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("La longitud de la circuferencia es: " + longitudCircuferencia);
                System.out.println("El área del circulo es: " + areaCirculo);
            }
            //Ahora volvemos a poner radio !(distinto)=0 para cuando pulsemos 0 salga del ciclo
        }while (radio !=0);
        //Imprima por pantalla A salido correctamnete al pulsar 0
        System.out.println("A saldio correctamente");
        teclado.close();
    }

    public static void main(String[] args) {
        //Para iniar la funcion del subprocesio
        CircuferenciaArea();
    }
}
