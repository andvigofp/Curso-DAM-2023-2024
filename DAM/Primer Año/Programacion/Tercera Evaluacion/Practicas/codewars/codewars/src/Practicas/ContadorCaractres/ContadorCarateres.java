package Practicas.ContadorCaractres;

/**
 * Te van a dar una palabra. Su trabajo será asegurarse de que cada carácter de esa palabra tenga exactamente el mismo número de apariciones. Volverás truesi es válido, o falsesi no lo es.
 *
 * Para este kata, las mayúsculas se consideran iguales que las minúsculas. Por lo tanto:"A" == "a"
 *
 * La entrada es una cadena (sin espacios) que contiene [a-z],[A-Z],[0-9]símbolos comunes. La longitud será 0 < length < 100.
 *
 * Ejemplos
 * "abcabc"es una palabra válida porque "a"aparece dos veces, "b"aparece dos veces y "c"aparece dos veces.
 * "abcabcd"NO es una palabra válida porque "a"aparece dos veces, "b"aparece dos veces, "c"aparece dos veces, ¡pero "d"solo aparece una vez!
 * "123abc!"es una palabra válida porque todos los caracteres solo aparecen una vez en la palabra.
 */
public class ContadorCarateres {

        public static boolean validateWord(String word) {
            //Creamos un arreglo para contar la cantidad de veces que aparece cada caracter
            int[] occurrences = new int[128]; // Asumimos caracteres ASCII

            //Convertimos todas las letras a minúsculas para considerarlas iguales
            word = word.toLowerCase();

            // Contamos la cantidad de ocurrencias de cada caracter
            for (char c : word.toCharArray()) {
                occurrences[c]++;
            }

            //Verificamos que todas las ocurrencias sean iguales
            int count = -1;
            for (int num : occurrences) {
                if (num > 0) {
                    if (count == -1) {
                        count = num;
                    } else if (count != num) {
                        return false;
                    }
                }
            }

            return true;
        }
    }