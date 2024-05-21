package org.andres.example.Modelo;


import java.util.Arrays;
import java.util.Objects;

public class Cartas_Ej12 implements Comparable<Cartas_Ej12> {
    private P_EJ12[] palos = {P_EJ12.Oros, P_EJ12.Copas, P_EJ12.Bastos, P_EJ12.Espadas};
    private String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "Sota",  "Caballo", "Rey"};
    private String numero;
    private String palo;

    public Cartas_Ej12() {
        this.numero = numeros[(int) (Math.random()*10)];
        this.palo = Arrays.toString(new P_EJ12[]{palos[(int) (Math.random() * 4)]});
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica si el objeto es nulo
        if (obj == null) {
            return false;
        }
        // Verifica si los objetos son de la misma clase
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Convierte el objeto a tipo Cartas
        final Cartas_Ej12 other = (Cartas_Ej12) obj;
        // Compara los números de las cartas
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        // Compara los palos de las cartas
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        // Las cartas son iguales si tienen el mismo número y palo
        return true;
    }


    @Override
    public int compareTo(Cartas_Ej12 c) {
        // Compara los palos de las cartas
        if (palo.equals(c.getPalo())) {
            // Si los palos son iguales, compara los números de las cartas
            return numero.compareTo(c.getNumero());
        } else {
            // Si los palos son diferentes, compara los palos de las cartas
            return palo.compareTo(c.getPalo());
        }
    }
}

