package classes.impl;

import classes.impl.Participante;

import java.time.Duration;

public class ParticipanteCarrera extends Participante {

    // Atributos
    private double tiempo; // Usaremos el paquete 'java.time' porque nos permite manejar fechas, horas, períodos y duraciones de tiempo

    // Constructor
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;
    }

    // Métodos
    @Override
    public String toString() {
        return "classes.impl.ParticipanteCarrera" + "\n" +
                "dni: " + getDni() + "\n" +
                ", nombre: " + getNombre() + "\n" +
                ", apellidos: " + getApellidos() + "\n" +
                ", edad: " + getEdad() + "\n" +
                ", tiempo: " + getTiempo() + " minutos";
    }

    // Getters and setters
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
