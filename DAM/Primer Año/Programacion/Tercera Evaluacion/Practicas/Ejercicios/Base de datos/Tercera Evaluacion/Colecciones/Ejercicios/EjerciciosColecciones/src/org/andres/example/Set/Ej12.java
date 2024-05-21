package org.andres.example.Set;

import org.andres.example.Metodos.MEJ12;
import org.andres.example.Modelo.Cartas_Ej12;

import java.util.HashMap;
import java.util.List;

public class Ej12 {
    public static void main(String[] args) {
        List<Cartas_Ej12> mazo = MEJ12.crearMazo();
        //Asignar los puntos a las cartas
        HashMap<String, Integer> valoresCartas =  MEJ12.asignarValoresCartas();
        //Calcular el total de los puntos de las cartas
        int puntos = MEJ12.calcularPuntos(mazo,valoresCartas);
        //Mostrar el resultado de los puntos
        MEJ12.mostrarPuntos(mazo, puntos);

    }
}
