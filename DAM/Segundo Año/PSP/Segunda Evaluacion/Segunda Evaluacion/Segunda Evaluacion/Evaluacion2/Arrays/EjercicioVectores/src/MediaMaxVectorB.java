import java.util.Scanner;

public class MediaMaxVectorB {
    /**
     *Calcular Media de todos los valores, máximo y mínimo dentro del vector
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables tipo entero
        int maximo, minimo;
        //Varibale de tipo double
        double media;

        //Obtener la longitud del vector desde un usuario
        System.out.println("Ingrese la longitud del vector: ");
        int longitud = teclado.nextInt();

        int vector[] = generarNumerosAletorios((longitud));

        //Calcular la media, el valor máximo y el valor mínimo
        media = calcularMedia(vector);
        maximo = encontarMaximo(vector);
        minimo = encontarMinimo(vector);

        //Imprimir los resultados
        System.out.println("\nMedia de los valoers: " + media +
                "\nValor máximo: " + maximo +
                "\nValor mínimo: " + minimo);
    }

    // Método para llenar un vector con números aleatorios
    private static int[] generarNumerosAletorios(int longitud) {
        int[] vector = new int[longitud];

        for (int i = 0; i<longitud; i++) {
            vector[i] = (int) (Math.random()*101);

        }
        return vector;
    }

    //Método para calcular la media
    private static double calcularMedia(int[] vector) {
        double suma=0;
        for (int valor: vector) {
            suma += valor;
        }
        return suma/vector.length;
    }

    //Método para encontar el valor máximo
    private static int encontarMaximo(int[] vector) {
        int maximo = vector[0];
        for (int valor: vector) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    ////Método para encontar el valor mínimo
    private static int encontarMinimo(int[] vector) {
        int minimo = vector[0];
        for (int valor : vector) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }
}
