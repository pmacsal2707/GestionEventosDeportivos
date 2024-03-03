package classes.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{

    // Atributos
    private ArrayList<Equipo> equipos;

    // Metodo constructor
    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    // Metodo obtenerGanador
    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> winner = new ArrayList<>();

        int maxPoints = Integer.MIN_VALUE;
        Equipo ganador = null;

        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getPuntos() > maxPoints) {
                maxPoints = equipos.get(i).getPuntos();
                ganador = equipos.get(i);
            }
        }

        if (ganador != null) {
            // Agregamos los jugadores del equipo ganador a la lista de ganadores
            winner.addAll(ganador.getJugadores());
        }

        return winner;
    }

    // Metodo inscribirEquipo
    public boolean inscribirEquipo(Equipo equipo){
        boolean sePuedeInscribir = true;
        for (int i=0; i<equipos.size(); i++) {
            if (equipos.get(i).getNombre().equals(equipo.getNombre())) {
                System.out.println("ERROR: El equipo ya se ha registrado anteriormente");
                sePuedeInscribir = false;
                break;
            }
        }
        if (sePuedeInscribir) {
            equipos.add(equipo);
            System.out.println("Equipo exitosamente añadido");
        }
        return sePuedeInscribir;
    }

    // Getters and setters
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
