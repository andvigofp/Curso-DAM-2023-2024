public class Ejercicio2_B {
    public static void main(String[] args) {

        String[] asiganturas = new String[6];
        asiganturas[0] = "Sistemas Informáticos";
        asiganturas[1] = "Base de Datos";
        asiganturas[2] = "Lenguaje de Marcas";
        asiganturas[3] = "Programación";
        asiganturas[4] = "Entornos de Desarrollo";
        asiganturas[5] = "Acceso a datos";

        int[] alumnos =  new int[6];
        alumnos[0] = 21;
        alumnos[1] = 17;
        alumnos[2] = 30;
        alumnos[3] = 14;
        alumnos[4] = 12;
        alumnos[5] = 25;

        for (int i=0; i<asiganturas.length; i++) {
            System.out.println(asiganturas[i] +" : " + alumnos[i] + " alumnos");

        }
    }
    }

