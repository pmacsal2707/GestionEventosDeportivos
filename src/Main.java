import classes.impl.Carrera;
import classes.impl.Participante;
import classes.impl.ParticipanteCarrera;
import classes.impl.TorneoDeFutbol;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Carrera carrera = new Carrera("Carrera de velocidad", LocalDateTime.of(2023, 3, 19, 14, 30), "Sevilla", 30.2);
        TorneoDeFutbol furbito = new TorneoDeFutbol("Champion", LocalDateTime.now(), "Sevilla");

        Participante cristiano = new Participante("12345678-A", "Cristiano", "Ronaldo dos Santos Aveiro", 39);
        Participante elPanda = new Participante("23456789-B", "Borja", "Iglesias Quintás", 31);
        ParticipanteCarrera usainBolt = new ParticipanteCarrera("34567890-C", "Usain", "Bolt", 37, Duration.ofSeconds(31));

        System.out.println(usainBolt.getTiempo());
    }

}
