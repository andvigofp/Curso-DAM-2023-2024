package org.andres.example.Ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MEJ6 {
    //Método para añadir un  usuario y contraseña con HashMap
    public static Map<String,String> anadirDatos() {
        Map<String, String> usuario = new HashMap<>();
        usuario.put("Andres","1234");
        usuario.put("Luis","2345");
        usuario.put("Iria", "2346");
        return usuario;
    }
    //Método para verificar si el usuario y contrseña existe, intrdociendo un usuario y contraseña
    public static void comprobarDatos(Scanner teclado, Map<String, String> usuarios) {
        int contador = 3;
        boolean accesoConcedido = false;

        while (contador > 0 && !accesoConcedido) {
            System.out.println("Introduzca nombre de usuario:");
            String nombreUsuario = teclado.nextLine();
            System.out.println("Introduzca contraseña:");
            String contrasena = teclado.nextLine();

            //Verificar si el nombre de usuario existe y si la contraseña es correcta
            if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(contrasena)) {
                System.out.println("Has iniciado sesión en el área restringida.");
                accesoConcedido = true;
                break; // Salir del bucle después de conceder el acceso
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Intentos restantes: " + (--contador));
            }
        }

        if (!accesoConcedido) {
            System.out.println("Lo siento, se agotaron los intentos.");
        }
    }
}