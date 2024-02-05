public class VectorConPropiedadLength {
    /**
     * Utilizar la propiedad vector.length
     */

    public static void main(String[] args) {

        //Crear un vector con el tamaño especificado
        int vector[] = new int[6];

        //Crear eñ vector con el tamaño espeficiado
        for (int i=0; i<vector.length; i++) {
            vector[i] = i+1;
        }

        //Imprimir el vector
        System.out.println("Valor de un vector: ");
        imprimirVector(vector);

    }

    //Método auxiliar para imprimir un vector
    private static void imprimirVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
