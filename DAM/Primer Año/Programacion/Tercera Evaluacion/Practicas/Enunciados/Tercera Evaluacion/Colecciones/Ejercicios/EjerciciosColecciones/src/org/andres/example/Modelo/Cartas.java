package org.andres.example.Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Cartas {
   private P_Ej8[] palos = {P_Ej8.Oros, P_Ej8.Copas, P_Ej8.Bastos, P_Ej8.Espadas};
   private String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "Sota",  "Caballo", "Rey"};
    private String numero;
    private String palo;

    public Cartas() {
        this.numero = numeros[(int) (Math.random()*10)];
        this.palo = Arrays.toString(new P_Ej8[]{palos[(int) (Math.random() * 4)]});
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
        final Cartas other = (Cartas) obj;
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
}
