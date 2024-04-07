import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del
     * día de la semana. El precio base de una entrada son 8 euros. El miércoles (día del espectador), el precio base
     * es de 5 euros. Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros. Con la
     * tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran entradas,
     * el precio total sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja
     * más 1 individual que son 41 euros (33 + 8).
     *
     * Ejemplo 1:
     * Venta de entradas CineCampa
     * Número de entradas: 4
     * Día de la semana: martes
     * ¿Tiene tarjeta CineCampa? (s/n): n
     * Aquí tiene sus entradas. Gracias por su compra.
     * Entradas individuales 4
     * Precio por entrada individual 8.00 €
     * Total 32.00 €
     * Descuento 0.00 €
     * A pagar 32.00
     *
     * Ejemplo 2:
     * Venta de entradas CineCampa
     * Número de entradas: 4
     * Día de la semana: viernes
     * ¿Tiene tarjeta CineCampa? (s/n): s
     * Aquí tiene sus entradas. Gracias por su compra.
     * Entradas individuales 4
     * Precio por entrada individual 8.00 €
     * Total 32.00 €
     * Descuento 3.20 €
     * A pagar
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //variables tipo entero
        int numeroEntradas, pareja, individuales;
        //variables tipo double
        double precioTotal, descuento=0.0;
        //variables tipo String
        String diaSemana, tieneTarjeta;

        //Definir precios y descuentos
        final double precioBase = 8.0;
        final double precioDiaEspetador = 5.0;
        final double precioParejaJueves = 11.0;
        final double descuentoTarjeta = 0.1;

        System.out.println("Venta de entradas CineCampa: ");
        System.out.println("Número de entradas: ");
        numeroEntradas = teclado.nextInt();

        System.out.println("Día de la semana: ");
        diaSemana = teclado.next().toLowerCase();

        System.out.println("Tiene tarjeta CineCampa? (s/n)");
        tieneTarjeta = teclado.next().toLowerCase();
        //Depende el día tendra que aplicar un precio o otro
        if (diaSemana.equals("miercoles")) {
            precioTotal = precioDiaEspetador * numeroEntradas;
        } else if (diaSemana.equals("jueves")) {
            pareja = numeroEntradas/2;
            individuales = numeroEntradas%2;
            precioTotal = (precioParejaJueves * pareja) + (precioBase *individuales);
        }else {
            precioTotal = precioBase * numeroEntradas;
        }
        //Si tienes tajeta de socio se aplica un descuento del 10%
        if (tieneTarjeta.equals("s")) {
            descuento = precioTotal * descuentoTarjeta;
            System.out.println("Descuento " + descuento + "€");
            precioTotal -=descuento;
        }

        //Mostrar el resumen de la compra
        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        System.out.println("Entradas individuales " + numeroEntradas);
        System.out.println("Precio por entrada individual " + (diaSemana.equals("miercoles") ? precioDiaEspetador : precioBase) + " €");
        System.out.println("Total " + precioTotal + " €");
        System.out.println("Decuento " + descuento);
        System.out.println("A pagar " + precioTotal + " €");
    }
}
