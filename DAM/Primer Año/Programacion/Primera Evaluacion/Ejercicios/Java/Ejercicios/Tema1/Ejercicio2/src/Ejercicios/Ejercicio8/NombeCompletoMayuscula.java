package Ejercicios.Ejercicio8;

public class NombeCompletoMayuscula {
    public static void main(String[] args) {
        /**
         * Utilizando los datos del ejercicio anterior cambiar todas las letras del nombre y
         * apellido a mayúsculas.
         */
        //Declarar la variable "nombre" y asignarle un valor
        String nombre = "Andrés Fernández Pereira";
        //Convertir una cadena de caracteres en mayúscula
        String mayuscula = nombre.toUpperCase();

        // Mostrar el valor de la variable por pantalla
        System.out.println("Mi nombre completo es: " + nombre + "\n");
        //Mostrar nombre completo por pantalla
        System.out.println("Mi nombre completo en mayuscula: " + mayuscula);
    }
}
