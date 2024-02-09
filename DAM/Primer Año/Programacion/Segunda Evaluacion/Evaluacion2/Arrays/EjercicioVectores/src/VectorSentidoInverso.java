public class VectorSentidoInverso {
    /**
     * Recorrer el bucle en sentido inverso
     */

    public static void main(String[] args) {
        int vector[] = new int[6];


        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
            System.out.println("Valores " + i + " = " + vector[i]);
        }

        System.out.println("--------------------------------------");
        for (int i=vector.length-1; i>=0; i--) {
            System.out.println("valores: "+ vector[i]);
        }
    }
}
