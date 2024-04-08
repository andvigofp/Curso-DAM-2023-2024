package Practicas.CodificadorDuplicado;
import java.util.HashMap;
import java.util.Map;
/**
 * El objetivo de este ejercicio es convertir una cadena en una nueva cadena donde cada carácter de la nueva cadena es "("si ese carácter aparece solo una vez en la cadena original, o ")"si ese carácter aparece más de una vez en la cadena original. Ignore las mayúsculas al determinar si un personaje es un duplicado.
 *
 * Ejemplos
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 * Notas
 * Es posible que los mensajes de afirmación no sean claros en cuanto a lo que muestran en algunos idiomas. Si lees "...It Should encode XXX", ¡ "XXX"es el resultado esperado, no la entrada!
 */

public class DuplicateEncoder {
    static String encode(String word) {
        //Convertir la palabra a minúsculas para ignorar las mayúsculas
        word = word.toLowerCase();

        //Crear un mapa para almacenar la frecuencia de cada carácter en la palabra
        Map<Character, Integer> frequencyMap = new HashMap<>();

        //Contar la frecuencia de cada carácter en la palabra
        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        //Construir la nueva cadena de acuerdo con las reglas
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (frequencyMap.get(c) > 1) {
                result.append(')');
            } else {
                result.append('(');
            }
        }

        return result.toString();
    }
}