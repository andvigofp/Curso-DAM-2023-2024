package org.andres.example.Set;

import org.andres.example.Metodos.MEJ11;

import java.util.Map;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String,String> diccionario = MEJ11.crearDiccionario();
        MEJ11.mostrarMensajeBienvenida();
        String palabraEspanol = MEJ11.pedirPalabra(teclado);
        MEJ11.mostrarTraduccion(diccionario,palabraEspanol);

    }
}
