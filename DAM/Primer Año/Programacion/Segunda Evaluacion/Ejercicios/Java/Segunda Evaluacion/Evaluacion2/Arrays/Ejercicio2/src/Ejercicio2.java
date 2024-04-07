public class Ejercicio2 {
    /**
     * Queremos guardar en la memoria del ordenador el número de alumnos matriculados por módulos en el ciclo.
     * Sabemos que los alumnos matrículados por cada módulo son:
     * Sistemas Informáticos 21 alumnos.
     * Bases de Datos 17 alumnos
     * Programación 30 alumnos
     * Lenguaje de Marcas 14 alumnos.
     * Entornos de Desarrollo 12 alumnos
     * Acceso a datos 25 alumnos
     * Haz la declaración e inicialización que creas conveniente para guardar toda esta información.
     *
     */
    public static void main(String[] args) {


        String[] asiganturas = {"Sistemas Informáticos","Base de Datos","Lenguaje de Marcas","Programación","Entornos de Desarrollo","Acceso a datos"};

        int[] alumnos =  {21,17,30,14,12,25};

    for (int i=0; i<asiganturas.length; i++) {
        System.out.println(asiganturas[i] +" : " + alumnos[i] + " alumnos");

        }
    }


}
