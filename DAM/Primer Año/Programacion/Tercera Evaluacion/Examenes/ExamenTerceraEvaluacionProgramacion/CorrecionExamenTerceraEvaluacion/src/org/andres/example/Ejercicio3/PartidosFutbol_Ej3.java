package org.andres.example.Examen.Ejercicio3;

/**
 * Crea una clase llamada PartidoFutbol que guarde la información de cada uno de los partidos de una determinada
 * liga. La clase debe guardar el nombre del equipo local, el nombre del equipo visitante, y los goles que han metido
 * cada uno de ellos, (golesLocales, golesVisitante), durante el partido. La clase contendrá los siguientes métodos:
 * • Constructor por defecto.
 * • Constructor con parámetros.
 * • Métodos Setters/Getters
 *
 * Escribe además un programa que lea desde un archivo Partidos.txt los partidos en el formato que podemos ver
 * en la siguiente imagen, y vaya creando objetos PartidoFutbol que se irán guardando en un ArrayList.
 * Contenido de archivo Partidos.txt
 *
 *  Real Madrid-2-1-Barcelona
 *  Real Madrid-1-0-Sevilla
 *  Barcelona-2-3-Sevilla
 */
public class PartidosFutbol_Ej3 {
    private String equipoLocal;

    private int golLocal;

    private int golVisitante;
    private String equipoVisitante;



    public PartidosFutbol_Ej3() {
    }

    public PartidosFutbol_Ej3(String equipoLocal, int golLocal, int golVisitante, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
        this.equipoVisitante = equipoVisitante;
    }



    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal + "-" + getGolLocal()+ "-" + golVisitante + "-" + equipoVisitante;
    }
}
