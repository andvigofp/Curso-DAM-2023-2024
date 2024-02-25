

public class Main {
    public static void main(String[] args) {
        YESNo n = new YESNo(" NO ");
        YESNo y = new YESNo(" YES ");


        n.run();
        new Thread(y).start();


    }
}