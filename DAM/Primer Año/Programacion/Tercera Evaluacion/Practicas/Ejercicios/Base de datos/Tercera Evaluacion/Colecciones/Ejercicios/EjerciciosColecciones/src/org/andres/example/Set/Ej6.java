package org.andres.example.Set;

import org.andres.example.Metodos.MEJ6;

import java.util.Map;
import java.util.Scanner;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y
 * una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área
 * restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa
 * dirá “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario con sus correspondientes
 * contraseñas deben estar almacenados en una estructura de la clase HashMap
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> usuarios = MEJ6.anadirDatos();
        MEJ6.comprobarDatos(teclado, usuarios);
    }
}
