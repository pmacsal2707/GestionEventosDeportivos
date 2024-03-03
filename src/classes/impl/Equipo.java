package classes.impl;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo implements Comparable<Equipo> {

    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    // Constructor
    public Equipo(String nombre){
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    // Metodo para añadir un jugador al equipo
    public boolean anadirJugador(Participante jugador) {
        boolean sePuedeAnadir = true;
        for (int i=0; i<jugadores.size(); i++) {
            if (jugadores.get(i).getDni().equals(jugador.getDni())) {
                System.out.println("ERROR: El jugador ya se ha registrado anteriormente");
                sePuedeAnadir = false;
                break;
            }
        }
        if (sePuedeAnadir) {
            jugadores.add(jugador);
        }
        return sePuedeAnadir;
    }

    // Metodo para eliminar un jugador de la lista de jugadores
    public boolean eliminarJugador(Participante jugador) {
        boolean sePuedeEliminar = true;
        for (int i=0; i<jugadores.size(); i++) {
            if (jugadores.get(i).getDni().equals(jugador.getDni())) {
                sePuedeEliminar = true;
                System.out.println("El jugador "+jugador.getNombre()+" se ha eliminado correctamente");
                break;
            }
        }
        return sePuedeEliminar;
    }

    // Metodo toString
    @Override
    public String toString(){
        return  "nombre='" + this.nombre + "\n"+
                ", puntos='" + this.puntos + "\n"+
                ", jugadores='" + this.jugadores.size() + "\n";
    }

    // Metodo equals
    @Override
    public boolean equals(Object team) {
        if (team instanceof Equipo) {
            Equipo team2 =  (Equipo) team;

            if (this.nombre.equals(team2.nombre)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Metodo compareTo
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
