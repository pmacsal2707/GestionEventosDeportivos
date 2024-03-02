package classes.impl;

import classes.api.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

    // Atributos
    protected String nombre;
    protected LocalDateTime fecha;
    protected String lugar;
    protected ArrayList<Participante> participantes;

    // Constructor
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Metodos
    public boolean inscribirParticipante(Participante participante) {
        boolean sePuedeInscribir = true;
        for (int i=0; i<participantes.size(); i++) {
            if (participantes.get(i).getDni().equals(participante.getDni())) {
                System.out.println("ERROR: El participante ya se ha registrado anteriormente");
                sePuedeInscribir = false;
                break;
            }
        }
        if (sePuedeInscribir) {
            participantes.add(participante);
        }
        return sePuedeInscribir;
    }

    // Método para acceder a la lista de participantes
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public abstract ArrayList<Participante> obtenerGanador();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
