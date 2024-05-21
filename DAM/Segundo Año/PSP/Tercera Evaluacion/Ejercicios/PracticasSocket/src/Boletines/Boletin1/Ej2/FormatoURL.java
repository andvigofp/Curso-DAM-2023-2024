package Boletines.Boletin1.Ej2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Implementa un programa que recoja por teclado una URL (con el formato
 * http://www.sitioweb.dom)  abra una conexión a dicho sitio Web, mostrando por pantalla el
 * código HTML de su HTML de su página inicial.
 */
public class FormatoURL {
    public static void main(String[] args) {
        URL url = null;

        try {
            url = new URL("https://www.marca.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader in;

        try {
            InputStream inputStream = url.openStream();
            in = new BufferedReader(new
                    InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine = in.readLine()) !=null)
                System.out.println(inputLine);
            in.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
