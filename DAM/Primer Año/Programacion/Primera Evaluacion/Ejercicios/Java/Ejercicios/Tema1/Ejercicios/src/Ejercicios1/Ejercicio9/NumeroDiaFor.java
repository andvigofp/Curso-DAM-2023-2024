package Ejercicios1.Ejercicio9;

import java.util.Scanner;

public class NumeroDiaFor {
    public static void main(String[] args) {
        /**
         * Pedir un número al usuario y mostrar el nombre del día al que corresponde (1=lunes) con ciclo For
         */
        //Creamos un Array de tipo caracter para sacar el nombre del día (Lunes hasta Domingo)
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Sabado", "Domingo"};
        //Variable tipo String
        int numero1;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entre (1,7) para obtener el nombre del día: ");
        numero1 = teclado.nextInt();
        //Inicio
        //Utilizamos if es Si número 1 hasta 7
        if (numero1 >=1 && numero1<=7) {
            //Utilizamos el bucle for para recorror los casos del switch, el nombre día correspondiente 1 al 7
            for (int i=1; i<=7; i++) {
                //Volvemos a utilizar otro if Si iguamos la varaible i==numero, para que sepa el número que del día
                if (i==numero1) {
                    //Utilizamos el swict para hacer todos los casos posibles de los dias de la seamana
                    switch (i) {
                        case 1:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 2:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 3:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 4:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 5:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 6:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                        case 7:
                            System.out.println("El número: " + i + " corresponde a: " + diasSemana[i -1]);
                            break;
                    }
                }

            }

        }else {
            System.out.println("Número fuera de rango");
        }
        teclado.close();
        //Fin
    }
}
