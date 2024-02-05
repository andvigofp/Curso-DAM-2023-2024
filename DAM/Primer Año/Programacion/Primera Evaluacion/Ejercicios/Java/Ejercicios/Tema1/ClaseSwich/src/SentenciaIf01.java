import java.util.Scanner;

public class SentenciaIf01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es la la capital de Kirbai?");
        String respuesta = teclado.nextLine();
        if (respuesta.equals("Tarawa")) {
            System.out.println("!La respuesta es correcta");
        }else {
            System.out.println("Lo siento, la respuesta es incorrecta");
        }
    }
}
