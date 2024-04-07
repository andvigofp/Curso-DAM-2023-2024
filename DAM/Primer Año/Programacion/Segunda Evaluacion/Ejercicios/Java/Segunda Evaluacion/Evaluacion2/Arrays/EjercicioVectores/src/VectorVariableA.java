public class VectorVariableA {
    /**
     * Crear el vector indicando el tamaño en una variable
     */

    public static void main(String[] args) {
        //Definir el tamaño del vector utilizando una variable
        int tamanoVariable = 6;

        //Crear un vector con el tamaño especificado por la variable
        int vector[] = new int[tamanoVariable];

        // Inicializar el vector con valores consecutivos
        for (int i=0; i<tamanoVariable; i++) {
            vector[i] = i +1;  // Asignar valores consecutivos
        }

        //Imprimir el vector
        System.out.println("Vector creado con variable: ");
        imprimirVector(vector);
    }

    //Método auxiliar para imprimir el vector
    private static void imprimirVector(int[] vector) {
        for (int i: vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
