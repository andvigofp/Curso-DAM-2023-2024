import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        double nota1, nota2, media;
        String resultadoRecuperacion;

        //Solicitar las notas al usuario
        System.out.println("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.println("La nota segundo control: ");
        nota2 = teclado.nextDouble();

        //Calcular la media de las notas
        media = (nota1 + nota2) /2;

        //Verificar si la media es mayor o igual a 5
        if (media >=5) {
            System.out.println("Tu nota de programación es " + media);
        }else {
            //Preguntar por el resultado de recuperación
            System.out.println("¿ Cúal ha sido el reulstado de la recuperación? (apto/no apto): ");
            resultadoRecuperacion = teclado.next();

            //Verificar el resultado de recuperación
            if (resultadoRecuperacion.equals("apto")) {
                System.out.println("Tu nota de programación es 5");
            }else {
                System.out.println("Tu nota de programación es " + media);
            }
        }
    }
}
