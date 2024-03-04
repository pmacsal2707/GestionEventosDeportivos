
import classes.impl.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // 1º Instanciar eventos deportivos
        Carrera carrera = new Carrera("Carrera de velocidad", LocalDateTime.of(2023, 3, 19, 14, 30), "Sevilla", 30.2);
        TorneoDeFutbol furbito = new TorneoDeFutbol("Champion", LocalDateTime.now(), "Sevilla");
        Carrera maratonBoston = new Carrera("Maratón de Boston", LocalDateTime.now(), "Boston", 42.195);
        TorneoDeFutbol torneoFutbol = new TorneoDeFutbol("UEFA Champions League", LocalDateTime.now(), "Estadio Santiago Bernabéu");

        // 2º Añadir participantes a los eventos
        // Primero creamos 2 participantes
        ParticipanteCarrera participanteC1 = new ParticipanteCarrera("12345678A", "John", "Doe", 30, 14400.0); // 4 horas
        ParticipanteCarrera participanteC2 = new ParticipanteCarrera("23456789B", "Jane", "Smith", 25, 12600.0); // 3.5 horas
        ParticipanteCarrera usainBolt = new ParticipanteCarrera("34567890C", "Usain", "Bolt", 37, 12600.0);
        // Ahora los inscribimos
        maratonBoston.inscribirParticipante(participanteC1);
        maratonBoston.inscribirParticipante(participanteC2);
        maratonBoston.inscribirParticipante(usainBolt);

        // 3º Inscribir equipos en torneo de fútbol
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B");
        torneoFutbol.inscribirEquipo(equipo1);
        torneoFutbol.inscribirEquipo(equipo2);

        // 4º Añadir y eliminar jugadores de equipos
        Participante participante1 = new Participante("12345678A", "Francisco", "Hernandez", 26);
        Participante participante2 = new Participante("23456789B", "Pedro", "Perez", 18);
        Participante cristiano = new Participante("12345678A", "Cristiano", "Ronaldo dos Santos Aveiro", 39);
        Participante elPanda = new Participante("23456789B", "Borja", "Iglesias Quintás", 31);

        if (equipo1.anadirJugador(participante1)) { // Añadimos el jugador
            System.out.println("Jugador añadido al equipo.");
        } else {
            System.out.println("No se pudo añadir el jugador al equipo.");
        }
        if (equipo1.eliminarJugador(participante2)) { // Añadimos el jugador
            System.out.println("Jugador eliminado del equipo.");
        } else {
            System.out.println("No se pudo eliminar el jugador del equipo.");
        }
        if (equipo1.eliminarJugador(cristiano)) { // Añadimos el jugador
            System.out.println("Jugador eliminado del equipo.");
        } else {
            System.out.println("No se pudo eliminar el jugador del equipo.");
        }
        if (equipo1.eliminarJugador(elPanda)) { // Añadimos el jugador
            System.out.println("Jugador eliminado del equipo.");
        } else {
            System.out.println("No se pudo eliminar el jugador del equipo.");
        }

        // Mostrar información
        System.out.println("Información de la maratoon:\n" + maratonBoston.toString());
        System.out.println("Información del torneo de fútbol:\n" + torneoFutbol.toString());
        System.out.println("Información de la carrera:\n" + carrera.toString());
        System.out.println("Información del torneo de furbito:\n" + furbito.toString());

        System.out.println("Información del equipo 1: " + equipo1.toString());
        System.out.println("Información del equipo 2: " + equipo2.toString());

        System.out.println("Información del participante 1: " + participante1.toString());
        System.out.println("Información del participante 2: " + participante2.toString());
        System.out.println("Información del Cristiano: " + elPanda.toString());
        System.out.println("Información del ElPanda: " + cristiano.toString());
        System.out.println("Información del corredor 1: " + participanteC1.toString());
        System.out.println("Información del corredor 2: " + participanteC2.toString());
        System.out.println("Información del Usain: " + usainBolt.toString());



        // Mostrar lista de equipos ordenada por puntuación
        Collections.sort(torneoFutbol.getEquipos()); // Ordena la lista de equipos del torneo de fútbol por puntos acumulados
        System.out.println("Lista de equipos ordenada por puntuación: " + torneoFutbol.getEquipos()); // Muestra por consola la lista de equipos ordenada por puntuación
    }

}
