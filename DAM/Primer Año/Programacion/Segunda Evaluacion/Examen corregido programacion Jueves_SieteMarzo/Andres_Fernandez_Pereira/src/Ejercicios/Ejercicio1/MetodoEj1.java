package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class MetodoEj1 {

    //Método para pedir número de personas
    public static int pedirNumerosPersonas(Scanner teclado) {
        System.out.println("Dime nº de personas");
        return teclado.nextInt();
    }

    //Método para pedir al usuario si es varón o mujer y último el sueldo
    public static int[][] pedirInformacion(Scanner teclado, int numeroPersonas) {
        int[][] sueldos = new int[numeroPersonas][2];

        for (int fila=0; fila<sueldos.length; fila++) {
          for (int columna=0; columna<sueldos[fila].length; columna++) {
              if (columna==0) {
                  System.out.println("Ingrese el género (0 para varón y 1 para mujer ) " + fila + ": ");
                  sueldos[fila][columna] = teclado.nextInt();
              } else if (columna==1) {
                  System.out.println("Ingrese el sueldo para la persona " + fila + ": ");
                  sueldos[fila][columna] = teclado.nextInt();
              }else {
                  System.out.println("Error: solo puedes elegir dos opciones el 0 o 1");
              }

          }

        }
        return sueldos;
    }

    //Método para clacular el sueldoMedio
    public static double calcularSueldoMedio(int[][] sueldos, int genero) {

        int  sumasSueldos=0, contadorPersonas=0;

        for (int fila=0; fila<sueldos.length; fila++) {
                if (sueldos[fila][0] ==genero) {
                    sumasSueldos += sueldos[fila][1];
                    contadorPersonas++;
                }
            }
        //Evitar división por cero
        if (contadorPersonas==0) {
            return 0;

        }
        return (double) sumasSueldos/contadorPersonas;
    }

    //Mostrar el resultado del slario medio varones o mújeres
    public static void mostrarResultado(double suldoMedioVarones, double sueldoMedioMujeres) {
        System.out.println("Sueldo medio género masculino: " + suldoMedioVarones);
        System.out.println("Sueldo medio género femenio: " + sueldoMedioMujeres);

        if (suldoMedioVarones > sueldoMedioMujeres) {
            System.out.println("Existe una brecha salarial a favor de los hombres.");
        } else if (suldoMedioVarones < sueldoMedioMujeres) {
            System.out.println("Existe una brecha salarial a favor de los mujeres.");
        }else {
            System.out.println("No existe una brecha salarial entre hombre y mujeres.");
        }
    }
}
