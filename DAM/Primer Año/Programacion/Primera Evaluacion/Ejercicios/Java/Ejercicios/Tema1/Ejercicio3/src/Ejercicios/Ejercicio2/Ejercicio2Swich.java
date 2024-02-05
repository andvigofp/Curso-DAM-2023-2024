package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2Swich {
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
            //Salida por pantalla
            Scanner teclado = new Scanner(System.in);
            //variable tipo entero
            int hora;
            //Variable tipo String(caracter)
            String continuar;
            //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
            do {
                //Inico

                //Imprime por pantalla
                System.out.print("Por favor, introduce la hora (solo la parte de la hora, sin minutos): ");
                //Leer por teclado
                hora = teclado.nextInt();
                //Variable tipo String(Caracter)
                String saludo = "";
                //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
                switch (hora) {
                    case 6,7,8,9,10,11,12:
                        saludo = "Buenos días";
                        break;
                    case 13,14,15,16,17,18,19,20:
                        saludo = "Buenas tardes";
                        break;
                    default:
                        saludo = "Buenas noches";
                        break;
                }
                //Imprime por pnatlla el resltado
                System.out.println(saludo);
                //imorime por pantalla
                System.out.print("Pulsa 0 para salir o cualquier otra tecla para ingresar otra hora: ");
                //Leer por teclado
                continuar = teclado.next();
                //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
            } while (!continuar.equals("0"));
            //Imprime por pantalla
        System.out.println("A salido correctamente");
        //Fin
        }
    }