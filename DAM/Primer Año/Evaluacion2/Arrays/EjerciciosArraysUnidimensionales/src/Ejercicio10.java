import java.util.Random;

public class Ejercicio10 {
    /**
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
     * un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
     * array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
     * es necesario.
     */

    public static void main(String[] args) {
        //Creamos un array para alamcenar los 20 números enteros
        int numeros[] = new int[20];

        //Generamos los números aleatoriso y los alamacenamos en el array
        Random random = new Random();
        for (int i=0; i<numeros.length; i++) {
            numeros[i] = random.nextInt(101); //Generamos un número aleatorio entre 0 y 100
        }

        //Cremos arrays auxiliares para alamcenar los números paraes o impares
        int pares[] = new int[numeros.length];
        int impares[] = new int[numeros.length];

        //Contadores para llevar el control de los números pares e impares
        int contadorPares=0, contadorImpares=0;

        //Separar los números pares en los arrays auxliares
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 ==0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            }else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        //Copiar los números pares e impares de los arrays auxiliares a array original
        for (int i=0; i<contadorPares; i++) {
            numeros[i] = pares[i];
        }

        for (int i=0; i<contadorImpares; i++) {
            numeros[contadorPares + i] = impares[i];
        }

        //Mostrar el array resultado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " | ");
            if (i<contadorPares) {
                System.out.println(" PAR ");
            }else {
                System.out.println(" IMPAR ");
            }
            }
        }
    }


