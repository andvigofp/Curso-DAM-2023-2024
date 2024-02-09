public class CopiarVector {
    /**
     * Copiar el contenido de un vector en otro
     */
    public static void main(String[] args) {

        //Crear un vector
        int vectorOriginal[] = new int[6];
        //Crear un vector para almacenar la copia
        int vectorCopia[] = new int[6];

        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorOriginal[i] = (int) (Math.random() * 101);
            System.out.println("Valores " + i + " = " + vectorOriginal[i]);
        }
        //Copiar el contenido del vector original al vector de copia usando un bucle for
        for (int i=0; i<vectorOriginal.length; i++) {
                vectorCopia[i] = vectorOriginal[i];
            }

        System.out.println("-----------------------");
        //Imprimir el vector original
        System.out.println("Vector Original: ");
        imprimirVector(vectorOriginal);
        System.out.println("-----------------------");
        //Imprimir el vector copia
        System.out.println("Vector Copia: ");
        imprimirVector(vectorCopia);
        }

        //Método auxiliar para imprimir un vector
        private static void imprimirVector(int[] vector) {
            for (int i: vector) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }

