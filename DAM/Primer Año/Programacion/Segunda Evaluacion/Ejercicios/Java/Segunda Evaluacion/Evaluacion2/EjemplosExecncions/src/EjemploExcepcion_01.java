public class EjemploExcepcion_01 {
    public static void main(String[] args) {

        try {
            int division = 10 / 0;
            System.out.println("División: " + division);
        }catch (Exception e) {
            System.out.println("Captura la excepción  en tiempo de ejecución " + e.getMessage());
        }finally {
            System.out.println("Es opcional, para que se ejecute siempre con o sin exceción");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación");

    }
}
