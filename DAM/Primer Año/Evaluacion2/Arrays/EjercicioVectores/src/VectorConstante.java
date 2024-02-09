public class VectorConstante {
   /**
    * Crear el vector indicando el tamaño en una Constante
    */

   //Definir una constante para el tamaño del vector
   private static final int TAMANO_VECTOR = 5;

   public static void main(String[] args) {

      //Crear un vector con el tamaño especificado por la constante
      int[] vector = new int[TAMANO_VECTOR];

      //Inicializar el vector con valores (puedes utilizar un bucle o ingresarlos manualmente)
      for (int i=0; i <TAMANO_VECTOR; i++) {
         vector[i] = i + 1;
      }

      //Imprimir el resultado de un vector
      System.out.print("Vector creado con constante: ");
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
