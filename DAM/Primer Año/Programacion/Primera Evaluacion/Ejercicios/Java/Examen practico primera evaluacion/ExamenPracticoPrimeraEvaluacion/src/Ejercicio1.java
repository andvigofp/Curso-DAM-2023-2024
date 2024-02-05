import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este
     * motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada
     * fruta. La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€
     * y el kilo de peras en 1,95€
     *
     * Ejemplo:
     * Venta Manzanas (en kilos) del primer semestre = 12
     * Venta Manzanas (en kilos) del segundo semestre = 3
     * Para las Peras
     * Venta Peras(en kilos) del primer semestre = 5
     * Venta Peras (en kilos) del segundo semestre = 7
     * El importe total es de :58.65euros
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo double
        double kilosManzanasPrimer, kilosManzanasSegun, kilosPerasPrimer,kilosPerasSegun, resultManzana, resultPeras, total;
        //Variable tipo double, pero dejando el resultado fijp
        final double manzanas = 2.35;
        final double peras = 1.95;

        System.out.println("Venta Manzanas (en kilos) del primer semestre: ");
        kilosManzanasPrimer = teclado.nextDouble();

        System.out.println("Venta Manzanas (en kilos) del segundo semestre: ");
        kilosManzanasSegun = teclado.nextDouble();

        System.out.println("Para las Peras");

        System.out.println("Venta Peras(en kilos) del primer semestre: ");
        kilosPerasPrimer = teclado.nextDouble();

        System.out.println("Venta Peras (en kilos) del segundo semestre: ");
        kilosPerasSegun = teclado.nextDouble();
        //Operaciones para calcular los kilos de manzanas y peras
        resultManzana= (kilosManzanasPrimer +kilosManzanasSegun)*manzanas;
        resultPeras = (kilosPerasPrimer + kilosPerasSegun) * peras;
        //Resultado total de la suma del resultadoManzana + peras
        total = resultManzana + resultPeras;
        //Imprime el resultado
        System.out.println("El importe total es de: " + total);
    }
}
