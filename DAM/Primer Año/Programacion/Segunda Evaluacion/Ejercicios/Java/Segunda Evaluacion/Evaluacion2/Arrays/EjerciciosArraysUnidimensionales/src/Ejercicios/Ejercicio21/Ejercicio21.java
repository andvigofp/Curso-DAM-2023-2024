package Ejercicios.Ejercicio21;

public class Ejercicio21 {
    /**
     * Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos entre
     * 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, según el siguiente
     * criterio: si el número que hay en una posición del array es múltiplo de 5, se deja igual, y si no, se
     * cambia por el siguiente múltiplo de 5 que exista a partir de él.
     *
     *
     Array original:
     459 204 20 250 178 90 353 35 229 357 224 454 260 310 140

     Array circuerizado:
     460 205 20 250 180 50 90 355 35 230 360 225 455 260 310 140
     */

    public static void main(String[] args) {
        //Crear un array de 15 elementos con números aleatorios entre 0 y 500
        int[] array = MetodosEj21.generarArrayAleatorio(15, 500);

        //Mostrar el array original
        System.out.println("Array original:");
        MetodosEj21.mostrarArray(array);

        //Mostrar el array cincuerizado
        MetodosEj21.cincuerizarArray(array);
        System.out.println("\nArray cincuerizado:");
        MetodosEj21.mostrarArray(array);
    }
}

