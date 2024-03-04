package classes.api;

import classes.impl.Participante;

import java.util.ArrayList;

/**
 * Interfaz que define un método para obtener el ganador de un evento deportivo
 */
public interface Ganador {

    // Métodos
    /**
     * Método para obtener el ganador del evento
     * @return un arrayList de participantes que representan al ganador del evento
     */
    ArrayList<Participante> obtenerGanador();

}
