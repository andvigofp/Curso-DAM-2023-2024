package Boletin2.Saldo;

public class Main {
    public static void main(String[] args) {
        Saldo saldo = new Saldo(1000);
        System.out.println("******* Saldo Incial: " + saldo.getSaldo());

        HiloDepositotarSaldo UNO, DOS, TRES, CUATRO;
        UNO = new HiloDepositotarSaldo(saldo, 1000, "#1");
        DOS = new HiloDepositotarSaldo(saldo, 1000, "\t#2");
        TRES = new HiloDepositotarSaldo(saldo,1000, "\t\t#3");
        CUATRO = new HiloDepositotarSaldo(saldo, 1000, "\t\t\t#4");

        UNO.start();
        DOS.start();
        TRES.start();
        CUATRO.start();

        try {
            UNO.join();
            DOS.join();
            TRES.join();
            CUATRO.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("***** Saldo Final: " + saldo.getSaldo());
    }
}
