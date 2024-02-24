package classes.impl;

import jdk.jshell.SourceCodeAnalysis;
import utils.gestionEventosDeportivosUtils;

public class Participante {

    // Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Participante(String dni, String nombre, String apellidos, int edad) {
        setDni(dni);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos
    @Override
    public String toString() {
        return "classes.impl.Participante" +
                "dni='" + dni + "\n"+
                ", nombre='" + nombre + "\n"+
                ", apellidos='" + apellidos + "\n"+
                ", edad=" + edad;
    }

    @Override
    public boolean equals(Object participant) {

        if (participant instanceof Participante) {
            Participante participante =  (Participante) participant;

            if (this.dni.equals(participante.dni)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Getters and setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (gestionEventosDeportivosUtils.checkDni(dni)) { // Comprobamos que el DNI sea correcto
            this.dni = dni;
        } else { // En el caso de que no lo sea mostramos el mensaje de error
            System.out.println("El DNI proporcionado no es válido.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
