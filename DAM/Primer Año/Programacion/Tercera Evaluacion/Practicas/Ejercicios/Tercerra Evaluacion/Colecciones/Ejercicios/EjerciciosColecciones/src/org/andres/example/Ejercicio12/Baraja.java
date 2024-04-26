package org.andres.example.Ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Cartas> cartas;
    private String[] figuras = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private  P[] palos = {P.Oros, P.Copas,P.Bastos,P.Espadas};

    public Baraja() {
        cartas = new ArrayList<>();

        // Crear las cartas y agregarlas a la baraja
        for (P palo : this.palos) {
            for (String figura : this.figuras) {
                cartas.add(new Cartas(figura, Arrays.toString(new P[]{palo})));
            }
        }
    }

    // Método para tomar una carta aleatoria de la baraja
    public Cartas tomarCarta() {
        Random random = new Random();
        int indice = random.nextInt(cartas.size());
        return cartas.remove(indice);
    }
}



