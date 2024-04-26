package org.angel.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map <String,String> persona = new HashMap<>();
        persona.put(null,"12345");
        persona.put("nombre", "John");
        persona.put("apellido","Estévez");
        persona.put("apellído","Estévez");
        persona.put("apellidoPaterno","Rodríguez");
        persona.put("email","john.estevez@gmail.com");
        persona.put("edad","33");
        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
        // vamos a eliminar el apellidoPaterno
        String valorApellido = persona.remove("apellidoPaterno");
        System.out.println("valorApellido = " + valorApellido);
        // boolean borrado = persona.remove("apellidoPaterno","Rodríguez");  // se borraría pasándole la llave y el elemento asociado, si lo encuentra lo elimina y true
       // System.out.println("borrado = " + borrado);
        System.out.println("persona = " + persona);

        //System.out.println("Eliminado = " + valorApellido);
        System.out.println("Persona = " + persona);
        boolean borrado2 = persona.containsKey("apellidoPaterno");
        System.out.println("El elemento se encuentra y  es = " + borrado2);
        // buscamos por el contenido que está asociado a la llave
        borrado2 = persona.containsValue("john.estevez@gmail.com");
        System.out.println("El contenido existe = " + borrado2);
        // recorre los  valore de HashMap
        Collection <String> valores = persona.values();
        for (String contenido: valores){

            System.out.println("Contenido = " + contenido);
        }

        // voy a ver las llaves que tienen
        Set <String> llaves = persona.keySet();
        for (String key : llaves ){

            System.out.println("Las key(s) son = " + key);
        }
        // para mostrar los dos elementos de cada iteración, llave y elementos asociado utilizamos la calse embebida de Map
        for (Map.Entry <String, String> par : persona.entrySet()){

            System.out.println(par.getKey()+" => " + par.getValue());
        }
        // otra manera diferente de mostrar las llaaves y los elementos asociados a éstas
        System.out.println("=====================================");
        for (String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave+ " => " + valor);

        }
        System.out.println("total : " + persona.size());
        System.out.println("Contiene elementos = " + persona.isEmpty());
        // reemplazar nombre
        persona.replace("nombre","Andrés", "Ambrosio"); // en este caso no cambia el nombre pq no lo encuentra
        persona.replace("nombre","John", "Ambrosio"); // en este caso sí cambia el nombre pq sí lo encuentra
        System.out.println("Persona = " + persona);







    }
}
