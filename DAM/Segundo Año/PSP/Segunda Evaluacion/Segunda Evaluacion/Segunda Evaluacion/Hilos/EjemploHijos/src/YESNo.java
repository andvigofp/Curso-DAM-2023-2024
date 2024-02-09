/**
 *  Crea un hilo que en su método run() muestre un "NO" hasta un máximo de 30 veces. En el método
 *  principal (main) tras ejecutar el star() de un hilo, mostrará "YES" hasta un máximo de 30 veces.
 *  Como salida obtendrás una serie alternativa de Noes Yeses ya que una vez indicada la ejecución del thead,
 *  el tiempo de la GPU se reparten entre todos los procesos y treads del sistema, con lo cual se intercalan
 *  instruccciones del método main() con instruciiones del método run().
 *
 *  Posible Salida
 *  YES YES YES YES YES
 */

class YESNo implements Runnable{
    String palabra;


    public YESNo(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public void run() {
        for (int i=0; i<30; i++) {
            System.out.print(palabra);
        }
    }
}
