import javax.swing.*;

public class EjemploExecepcion_02 {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println("División: " + division);
        }catch (NumberFormatException nfe) {
            System.out.println("Captura la excepción  en tiempo de ejecución " + nfe.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Captura la excepción  en tiempo de ejecución " + e.getMessage());
            main(args);
        }finally {
            System.out.println("es opcional, pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Continuamos con el flujo a muestra a aplicación");


    }
    }

