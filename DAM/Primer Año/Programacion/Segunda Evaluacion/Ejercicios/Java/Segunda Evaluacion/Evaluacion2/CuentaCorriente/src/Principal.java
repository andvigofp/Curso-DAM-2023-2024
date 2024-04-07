public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("36147672K", "Luis");

        System.out.println("Información de la cuenta " + cuenta.mostarInformacion());
        System.out.println("-------------------------------------------------------");
        System.out.println("Dinero a ingresar " +cuenta.ingresarDinero(1000));
        System.out.println("--------------------------------------------------------");
        System.out.println("Información de la cuenta " + cuenta.mostarInformacion());
        System.out.println("--------------------------------------------------------");
        System.out.println("Dinero a retirar " + cuenta.sacarDinero(500));
        System.out.println("--------------------------------------------------------");
        System.out.println("Información de la cuenta " + cuenta.mostarInformacion());
        System.out.println("--------------------------------------------------------");
        System.out.println("Dinero a retirar "+cuenta.sacarDinero(800));
    }

}
