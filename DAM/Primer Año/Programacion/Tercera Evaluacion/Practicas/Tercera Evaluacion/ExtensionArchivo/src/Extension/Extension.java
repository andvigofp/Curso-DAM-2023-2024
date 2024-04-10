package Extension;

import java.util.Arrays;

public class Extension {
    public static void main(String[] args) {

      extesion();

    }

    public static void extesion() {
        String archivo[] = {"uno.java", "java.ps", "benito.is"};


        for (String e: archivo) {
            System.out.println(".lench " + e.length());
            //Extrae la subacadena a o b, lastIndex saca la extension
            System.out.println(e.substring(e.lastIndexOf(".")));

        }
    }
}
