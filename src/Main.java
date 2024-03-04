import classes.impl.*;

import java.time.LocalDateTime;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Carrera carrera = new Carrera("Carrera de velocidad", LocalDateTime.of(2023, 3, 19, 14, 30), "Sevilla", 30.2);
        TorneoDeFutbol furbito = new TorneoDeFutbol("Champion", LocalDateTime.now(), "Sevilla");

        Participante cristiano = new Participante("12345678-A", "Cristiano", "Ronaldo dos Santos Aveiro", 39);
        Participante elPanda = new Participante("23456789-B", "Borja", "Iglesias Quintás", 31);
        ParticipanteCarrera usainBolt = new ParticipanteCarrera("34567890-C", "Usain", "Bolt", 37, Duration.ofSeconds(31));

        System.out.println(usainBolt.getTiempo());


        // 1º Instanciar eventos deportivos
        Carrera maratonBoston = new Carrera("Maratón de Boston", LocalDateTime.now(), "Boston", 42.195);
        TorneoDeFutbol torneoFutbol = new TorneoDeFutbol("UEFA Champions League", LocalDateTime.now(), "Estadio Santiago Bernabéu");

        // 2º Añadir participantes a los eventos
        // Primero creamos 2 participantes
        ParticipanteCarrera participanteC1 = new ParticipanteCarrera("12345678A", "John", "Doe", 30, 14400.0); // 4 horas
        ParticipanteCarrera participanteC2 = new ParticipanteCarrera("23456789B", "Jane", "Smith", 25, 12600.0); // 3.5 horas
        // Ahora los inscribimos
        maratonBoston.inscribirParticipante(participanteC1);
        maratonBoston.inscribirParticipante(participanteC2);

        // 3º Inscribir equipos en torneo de fútbol
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B");
        torneoFutbol.inscribirEquipo(equipo1);
        torneoFutbol.inscribirEquipo(equipo2);

        // 4º Añadir y eliminar jugadores de equipos
        Participante participante1 = new Participante("12345678A", "Francisco", "Hernandez", 26);
        Participante participante2 = new Participante("23456789B", "Pedro", "Perez", 18);

        if (equipo1.anadirJugador(participante1)) {
            System.out.println("Jugador añadido al equipo.");
        } else {
            System.out.println("No se pudo añadir el jugador al equipo.");
        }
        if (equipo1.eliminarJugador(participante2)) {
            System.out.println("Jugador eliminado del equipo.");
        } else {
            System.out.println("No se pudo eliminar el jugador del equipo.");
        }

        // Mostrar información
        System.out.println("Información de la carrera:\n" + maratonBoston.toString());
        System.out.println("Información del torneo de fútbol:\n" + torneoFutbol.toString());

        equipo1.toString();
        equipo2.toString();

        participanteC1.toString();
        participanteC2.toString();
        participante1.toString();
        participante2.toString();

        // Mostrar lista de equipos ordenada por puntuación
        Collections.sort(torneoFutbol.getEquipos());
        System.out.println("Lista de equipos ordenada por puntuación: " + torneoFutbol.getEquipos());


    }
}
