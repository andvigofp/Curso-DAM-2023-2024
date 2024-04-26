package org.angel.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Map <String,String> persona = new HashMap<>();

        persona.put("nombre", "John");
        persona.put("apellido","Estévez");
        persona.put("apellido","Estévez");
        persona.put("apellidoPaterno","Rodríguez");
        persona.put("email","john.estevez@gmail.com");
        persona.put("edad","33");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","california");
        direccion.put("ciudad","santa barabara");
        direccion.put("calle","one street");
        direccion.put("numero","123");
       // persona.put("direccion", direccion);

        System.out.println("persona = " + persona);









    }
}
