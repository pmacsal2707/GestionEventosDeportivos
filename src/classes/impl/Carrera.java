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

    // Métodos
    @Override
    public ArrayList<Participante> obtenerGanador() {
        // Inicializamos winner para guardar al ganador de la carrera
        ArrayList<Participante> winner = new ArrayList<>();

        // Creamos una variable con el mayor valor posible de un double para ir comparando el tiempo con el de los participantes
        double menorTiempo = Double.MAX_VALUE;
        // Y creamos un participante llamado ganador y lo establecemos a null
        Participante ganador = null;

        // Recorremos todos los participantes
        for (int i = 0; i< getParticipantes().size(); i++) {
            // Guardamos el participante de cada posición como un participante
            Participante participante = getParticipantes().get(i);

            // Verificamos si el participante es de tipo ParticipanteCarrera
            if (participante instanceof ParticipanteCarrera) {
                // Si es de tipo participanteCarrera lo guardamos como un participanteCarrera
                ParticipanteCarrera participanteCarrera = (ParticipanteCarrera) participante;

                // Obtenemos el tiempo del participanteCarrera
                double tiempoParticipante = participanteCarrera.getTiempo().toSeconds();
                if (tiempoParticipante < menorTiempo) { // Si el tiempo es menor al menor tiempo encontrado hasta ahora actualizamos el menor tiempo
                    menorTiempo = tiempoParticipante;
                    ganador = participante; // El ganador es el que al final del bucle tiene menor tiempo
                }
            }
        }

        if (ganador != null) { // Después del bucle se ha encontrado un ganador, es decir, ganador no es null:
            winner.add(ganador); // Guardamos el ganador en el arrayList
        }

        return winner; // Finalmente devolvemos el arrayList winner
    }

    // Getters and setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
