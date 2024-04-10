public class Ejemplo {
    public static void main(String[] args) {
        String str1 = "Hola Juán";
        String str2 = new String("Hola Miguel");
        String str3 = "Osito de peluche";
        String str4 = "Perico";


        //Cuenta el número de carácteres
        System.out.println(str1.length());
        //Compara si amabas son iguales true o false
        System.out.println("Tienen el mismo valor? " + str1.equals(str2));
        //Compara si ambas son iguales, ignora minúsculas o mayúsculas
        System.out.println(str1.equalsIgnoreCase(str2));
        //Compara contra una cadena del argumento, devuelve un valor negativo anterior a b
        System.out.println(str1.compareTo(str2));
        //Crea un nuevo objecto eliminando un espacio en blanco
        System.out.println(str2.trim());
        //Extrae un caracter de la posición indicada por ejemplo 6 (u)
        System.out.println(str1.charAt(6));
        //Convierte la cadena en un arreglo de cactares
        System.out.println(str2.toCharArray());
        //Extrae la subcacena mediante las posciones a y b
        System.out.println(str1.substring(0,4));
        System.out.println(str4.substring(1));


        //Indican la posción se encuentra el caracter
        System.out.println(str1.indexOf("o",1));
        //Indica en que posción se encuentra el caracter
        char letra ='d';
        System.out.println(str3.lastIndexOf(letra));
        //Dice si la cadena, si la posicion conincide con el caracter es true, si no coincide false
        System.out.println(str2.startsWith("H",1));
        //Si la última letra de la cadena coincide es true, si no coincide es falso
        System.out.println(str1.endsWith("n"));

        //Divide la cadena en varias subcaedenas
        String[] letras = str1.split(" ");

        for (String l : letras) {
            System.out.println(l);
        }

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() " + trabalenguas.toCharArray() );

        //Convertir un sring en array
        char [] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;

        for (int i=0; i<largo; i++) {
            System.out.print(" " + arreglo[i] + " ");
        }


    }
}
