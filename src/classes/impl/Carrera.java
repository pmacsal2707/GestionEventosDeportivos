package classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo{

    // Atributos
    private double distancia;

    // Constructor
    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    // Metodos
    @Override
    public ArrayList<Participante> obtenerGanador() {

        return null;

    }
}

