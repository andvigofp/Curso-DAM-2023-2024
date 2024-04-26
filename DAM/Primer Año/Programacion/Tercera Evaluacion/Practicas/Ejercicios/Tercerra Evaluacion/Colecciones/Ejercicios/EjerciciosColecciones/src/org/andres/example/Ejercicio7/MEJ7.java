package org.andres.example.Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MEJ7 {
    public static List<Moneda> generarMonedas() {
        List<Moneda> monedas = new ArrayList<>();

        Moneda monedaAux = new Moneda();
        monedas.add(monedaAux);
        int cantidadMonedas=5;

        // Variables para alamacenar la última cantidad y posción generadas
        String ultimaPoscion=monedaAux.getPosicion();
        String ultimaCantidad=monedaAux.getCantidad();

        for (int i=0; i<cantidadMonedas; i++ ) {
            do {
                monedaAux = new Moneda();
            } while (!((monedaAux.getPosicion()).equals(ultimaPoscion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
            monedas.add(monedaAux);
            ultimaPoscion = monedaAux.getPosicion();
            ultimaCantidad = monedaAux.getCantidad();
        }

        return monedas;
    }
}
