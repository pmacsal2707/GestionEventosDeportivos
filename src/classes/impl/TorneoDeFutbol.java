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
        return null;
    }

    // Metodo inscribirEquipo
    public boolean inscribirEquipo(Equipo equipo){
        boolean sePuedeInscribir = true;
        for (int i=0; i<equipos.size(); i++) {
            if (equipos.get(i).getNombre().equals(equipo.getNombre())) {
                System.out.println("ERROR: El participante ya se ha registrado anteriormente");
                sePuedeInscribir = false;
                break;
            }
        }
        if (sePuedeInscribir) {
            equipos.add(equipo);
        }
        return sePuedeInscribir;
    }
}
