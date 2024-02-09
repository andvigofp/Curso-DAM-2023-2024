public class CopiarVectorInverso {
    /**
     * Copiar el contenido de un vector en otro invirtiendo posiciones
     */
    public static void main(String[] args) {

        //Crear un vector
        int vectorOriginal[] = new int[6];

        //Crear un vector nuevo para almacenar la copia invertida
        int vectorInvertido[] = new int[6];

        //Valores aletorios de un vector, recorriendo en un bucle for
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorOriginal[i] = (int) (Math.random() * 101); //Valores aleatorios
            System.out.println("Valores " + i + " = " + vectorOriginal[i]);
        }

        // Copiar el contenido invirtiendo las posiciones
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        // Imprimir el vector original
        System.out.print("Vector Original: ");
        imprimirVector(vectorOriginal);

        // Imprimir el vector invertido
        System.out.print("Vector Invertido: ");
        imprimirVector(vectorInvertido);
    }

    //Método auxiliar para imprimir un vector
    private static void imprimirVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    }


