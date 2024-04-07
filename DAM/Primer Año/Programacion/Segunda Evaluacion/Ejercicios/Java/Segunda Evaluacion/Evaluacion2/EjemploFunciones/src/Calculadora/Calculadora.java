package Calculadora;


import java.util.Scanner;

public class Calculadora {
    static int sumar(int numero1, int numero2)  { //Función que realiza la suma de dos números   enteros
        return numero1 + numero2;
    }

    static int resta (int numero1, int numero2) { //Función que realiza la resta de dos números enteros

        return numero1-numero2;
    }

    static int multiplicar (int numero1, int numero2) { //Función que realiza la multiplicación de dos números enteros

        return numero1*numero2;
    }

    static int dividir (int numero1, int numero2) { //Función que realiza al dividir de dos números enteros

        return numero1/numero2;
    }

    static int raizCuadrada(double numero) {
        return (int) (Math.PI * Math.pow(numero,2));
    }

    static int pedir(String g){ //Función para pedir datos
        Scanner teclado = new Scanner(System.in);
        System.out.println(g);
        return teclado.nextInt();

    }

    static void mostar(String op, int solucion) { //Función mostar una operación y el resultado
        System.out.println(op + " = " + solucion);

    }

    static void opciones() { //Función Menú de opciones
        System.out.println("Elige una de las opciones");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- RaizCuadrada");
        System.out.println("6- Salir");

    }


    static void menu() { //Función Menú que recorre por un bucle do while, hasta que cumpla cada caso del swich, hasta que pulsemos botón 5 para salir
        Scanner teclado = new Scanner(System.in);
        int opc,num1=0,num2=0;

        do {
            opciones();
            opc = teclado.nextInt();
            if ( opc>0 && opc<5) { //Se cumple mientras que sea un número mayor a 0 hasta número 5


            }

                switch (opc) {
                    case 1:
                        num1 = pedir("Dame número 1");
                        num2 = pedir("Dame número 2");
                        mostar("Sumar ", sumar(num1, num2));
                        break;
                    case 2:
                        num1 = pedir("Dame número 1");
                        num2 = pedir("Dame número 2");
                        mostar("Restar ", resta(num1, num2));
                        break;
                    case 3:
                        num1 = pedir("Dame número 1");
                        num2 = pedir("Dame número 2");
                        mostar("Multiplicar ", multiplicar(num1, num2));
                        break;
                    case 4:
                        num1 = pedir("Dame número 1");
                        num2 = pedir("Dame número 2");
                        mostar("Dividir ", dividir(num1, num2));
                        break;
                    case 5:
                        num1 = pedir("Dame número 1");
                        mostar("RaizCuadrada ", raizCuadrada(num1));
                        break;
                    case 6:
                        System.out.println("FIN del programa");
                        break;
                    default:
                        System.out.println("Error, tienes que elegir una de las opciones entre 1 y 5");
                        break;

                }

            }while (opc !=6); //Sale cuando pulsemos 5
            
        }
    


    public static void main(String[] args) {
        //LLamamos a la función Menú
    menu();
    }
}
