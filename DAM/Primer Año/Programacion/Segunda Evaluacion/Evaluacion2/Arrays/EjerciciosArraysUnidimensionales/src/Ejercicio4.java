import java.util.Random;

public class Ejercicio4 {
    /**
     * Define tres arrays de 20 números enteros cada una, con nombres número, cuadrado y cubo. Carga el
     * array número con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
     * cuadrados de los valores que hay en el array número. En el array cubo se deben almacenar los cubos
     * de los valores que hay en número. A continuación, muestra el contenido de los tres arrays dispuesto
     * en tres columnas.
     */

    public static void main(String[] args) {
        Random random = new Random();

        int numero[] = new int[20];
        int cuadro[] = new int[20];
        int cubo[] = new int[20];

        int tamanoArray = numero.length;

        for (int i=0; i<tamanoArray; i++) {
            numero[i] = random.nextInt(100);
        }

        for (int i=0; i<tamanoArray; i++) {
            cuadro[i] = (int) (Math.pow(numero[i],2));
        }

        for (int i=0; i<tamanoArray; i++) {
            cubo[i] = (int) (Math.pow(numero[i],3));
        }

        for (int i=0; i<tamanoArray; i++) {
            System.out.println("\"|*******|\""+numero[i] + "|*******|" + cubo[i] + "|********|" + cuadro[i] + "|******|");
        }
    }
}
