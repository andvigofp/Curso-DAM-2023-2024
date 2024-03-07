package Boletin2.Saldo;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Arbitro {
    private final int numeroTotalJugadores;
    private final int numeroAdivinar;
    private final AtomicInteger turno;
    private boolean juegoFinalizado;

    Arbitro(int numeroTotalJugadores) {
        this.numeroTotalJugadores = numeroTotalJugadores;
        this.numeroAdivinar = new Random().nextInt(10) + 1;
        this.turno = new AtomicInteger(1);
        this.juegoFinalizado = false;
    }

    synchronized int getTurno() {
        return turno.get();
    }

    synchronized boolean juegoFinalizado() {
        return juegoFinalizado;
    }

    synchronized void comprobarJugada(int jugadorId, int numeroJugado) {
        if (numeroJugado == numeroAdivinar) {
            System.out.println("Boletin2.Saldo.Jugador " + jugadorId + " gana, ¡adivinó el número!");
            juegoFinalizado = true;
        } else {
            System.out.println("Boletin2.Saldo.Jugador " + jugadorId + " dice: " + numeroJugado);
            int proximoTurno = (jugadorId % numeroTotalJugadores) + 1;
            turno.set(proximoTurno);
            System.out.println("\tLe toca a Boletin2.Saldo.Jugador " + proximoTurno);
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

        for (int i = 1; i <= NUMERO_JUGADORES; i++) {
            new Jugador(i, arbitro).start();
        }
    }
}
