package org.andres.example.Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realiza de nuevo el ejercicio de la colección de Discos pero utilizando esta vez una lista para almacenar la
 * información sobre los discos en lugar de un array convencional. Comprobarás que el código se simplifica
 * notablemente ¿Cuánto ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 */

public class ColecciosnesDiscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Disco> album = new ArrayList<>();

        //Discos  preferidos
        album.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        album.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        album.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

        MenuPrincipal.mostrarMenu(album,teclado);

    }
}
