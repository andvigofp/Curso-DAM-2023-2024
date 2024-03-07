package Boletin2.Arbitro;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 7. Se trata de simular el juego para adivinar un número. Se crearán varios hilos, que actuarán como los
 * jugadores que tienen que adivinar el número. Habrá un árbitro que generará el número a adivinar,
 * comprobará la jugada del jugador y averiguará a qué jugador le toca jugar. El número tiene que estar
 * comprendido entre 1 y 10.
 * Por lo tanto, existirán 3 clases:
 * • Árbitro: Contiene el número a adivinar, el turno y muestra el resultado. Se definen los
 * siguientes atributos: número total de jugadores, turno, número a adivinar y si el juego acabó
 * o no. En el constructor se recibe el número de jugadores, y se inicializan el número y el turno.
 * Tendrá métodos para consultar el turno, si el juego ha acabado o no y otro que compruebe
 * la jugada del jugador y averigüe a qué jugador le toca a continuación. Este último método
 * recibirá el ID del jugador y el número que ha jugado. También se indicará si el juego ha
 * finalizado porque el jugador ha acertado el número.
 * • Boletin2.Arbitro.Jugador: Su constructor recibe un ID de jugador y el árbitro. Lo que harán los jugadores será
 * comprobar si es su turno, en ese caso, generará un número entre 1 y 10 y creará la jugada.
 * Este proceso se repetirá hasta que el juego acabe.
 * • Boletin2.Arbitro.Principal: Inicializa el árbitro y lanza los hilos.
 * Un ejemplo de salida sería el siguiente
 *
 * NÚMERO A ADIVINAR: 3
 *  Jugador1 dice: 9
 *      Le toaca a Jug2
 *  Jugador2 dice: 9
 *      Le toca a Jug3
 *  Jugador3 dice: 10
 *      Le toca a Jug1
 *  Jugaodor1 dice: 4
 *      Le toca a Jug2
 *  Jugador2 dice: 7
 *      Le toca Jug3
 *  Jugador3 dice: 7
 *      Le toca a Jug1
 *  Jugador1 dice: 6
 *      Le toca a Jug2
 *  Jugador2 dice: 3
 *      Boletin2.Arbitro.Jugador 2 gana, adivinó el número!!!
 *
 *
 */
class Arbitro {
    private final int numeroTotalJugadores;
    private final int numeroAdivinar;
    private final AtomicInteger turno;
    private boolean juegoFinalizado;

    Arbitro(int numeroTotalJugadores) {
        this.numeroTotalJugadores = numeroTotalJugadores;
        this.numeroAdivinar = new Random().nextInt(10) + 1;
        this.turno = new AtomicInteger(1); //Para automizar el incremento del contador
        this.juegoFinalizado = false;
    }

    synchronized int getTurno() {
        return turno.get();
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    synchronized boolean juegoFinalizado() {
        return juegoFinalizado;
    }

    synchronized void comprobarJugada(int jugadorId, int numeroJugado) {
        if (numeroJugado == numeroAdivinar) {
            System.out.println("Jugador " + jugadorId + " gana, ¡adivinó el número!");
            juegoFinalizado = true;
        } else {
            System.out.println("Jugador " + jugadorId + " dice: " + numeroJugado);
            int proximoTurno = (jugadorId % numeroTotalJugadores) + 1;
            turno.set(proximoTurno);
            System.out.println("\tLe toca Jugador " + proximoTurno);
        }
    }
}

class Jugador extends Thread {
    private final int jugadorId;
    private final Arbitro arbitro;

    Jugador(int jugadorId, Arbitro arbitro) {
        this.jugadorId = jugadorId;
        this.arbitro = arbitro;
    }

    @Override
    public void run() {
        while (!arbitro.juegoFinalizado()) {
            synchronized (arbitro) {
                if (arbitro.getTurno() == jugadorId) {
                    int numeroJugado = new Random().nextInt(10) + 1;
                    arbitro.comprobarJugada(jugadorId, numeroJugado);
                }
            }
        }
    }
}

class Principal {
    public static void main(String[] args) {
        final int NUMERO_JUGADORES = 3;
        Arbitro arbitro = new Arbitro(NUMERO_JUGADORES);
        System.out.println("NÚMERO DE ADIVINAR: " + arbitro.getNumeroAdivinar());
        for (int i = 1; i <= NUMERO_JUGADORES; i++) {
            new Jugador(i, arbitro).start();
        }
    }
}
