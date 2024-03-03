package classes.impl;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo implements Comparable<Equipo> {

    // Atributos
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    // Constructor
    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    // Método para añadir un jugador al equipo
    public boolean anadirJugador(Participante jugador) {
        if (jugadores.contains(jugador)) { // Verificamos si el jugador ya está en el equipo
            System.out.println("ERROR: El jugador ya se ha registrado anteriormente");
            return false;
        } else { // Si no está lo añadimos
            jugadores.add(jugador);
            return true;
        }
    }

    // Método para eliminar un jugador de la lista de jugadores
    public boolean eliminarJugador(Participante jugador) {
        if (!jugadores.contains(jugador)) { // Verificamos si el jugador está en la lista
            System.out.println("ERROR: El jugador no está registrado en este equipo"); // En caso de que no esté devolvemos un mensaje de error
            return false;
        }
        // Si se encuentra el jugador lo eliminamos de la lista
        jugadores.remove(jugador);
        System.out.println("El jugador "+jugador.getNombre()+" se ha eliminado correctamente");
        return true;
    }

    // Método toString
    @Override
    public String toString(){
        String resultado = "Equipo: " + nombre + "\n";
        resultado += "Puntos acumulados: " + puntos + "\n";
        resultado += "Jugadores:\n";
        for (int i = 0; i < jugadores.size(); i++) {
            resultado += "- " + jugadores.get(i) + "\n";
        }
        return resultado;
    }

    // Método equals
    @Override
    public boolean equals(Object team) {
        if (team instanceof Equipo) {
            Equipo team2 =  (Equipo) team;

            if (this.nombre.equalsIgnoreCase(team2.nombre)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Método compareTo
    @Override
    public int compareTo(Equipo eq) {
        if (this.puntos == eq.puntos) {
            return 0;
        } else if (this.puntos > eq.puntos) {
            return 1;
        } else {
            return -1;
        }
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }
}
