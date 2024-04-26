package org.angel.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHasMap {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put(null,"12345");
        persona.put("nombre", "john");
        persona.put("apellído", "Estévez");
        persona.put("apellido", "Estévez");
        persona.put("apellidoPaterno", "Rodriguez");
        persona.put("email", "john.estevez@gmail.com");
        persona.put("edad", "33");
        System.out.println("persona =  " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
        // vamos a eliminar el apellidoPaterno
        String valorApellido = persona.remove("apellidoPaterno");
        System.out.println("Eliminado = " + valorApellido);
        // boolean borrado = persona.remove("apellidoPaterno", "Rodriguez"); // se borrará pasamos la llave y el elemento asociado
        // System.out.println("borrado = " + borrado);
        System.out.println("Persona = " + persona);

        //System.out.println("Eliminado " + valorApellido);
        System.out.println("Persona = " + persona);
        boolean borrado2 = persona.containsKey("apellidoPaterno");
        System.out.println("El elemnto se encuentra y es = " + borrado2);

        // buscamos por el contendio que está asociado a la llave
        borrado2 = persona.containsValue("john.estevez@gmail.com");
        System.out.println("El contenido existe = " + borrado2);

        // recorre los valores de HashMap
        Collection <String> valores = persona.values();
        for (String contenido: valores) {
            System.out.println("Contenido = " + contenido);
        }

        // Voy a ver las llaves que tienen
        Set <String> llaves = persona.keySet();
        for (String key : llaves) {
            System.out.println("Las key(s) son = " + key);
        }

        for (Map.Entry<String, String> par : persona.entrySet()) {
            System.out.println(par.getKey() + " = " + par.getValue());
        }

        // otra manera diferente de mostrar las llaves y los elementos asociados a éstes
        System.out.println("=================================================");
        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos = " + persona.isEmpty());
        // remplazar nombre
        persona.replace("nombre", "Andrés", "Ambrosio"); // en este caso no cambio el nombre pq no la encuentra
        persona.replace("nombre", "John", "Ambrosio"); // en este caso si cambia el nombre pq si lo encuentra
        System.out.println("Persona = " + persona);
    }
}
