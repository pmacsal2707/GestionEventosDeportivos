package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase util para la gestión de eventos deportivos.
 */
public class gestionEventosDeportivosUtils {

    // Expresión regular para validar un DNI
    private static final String EXP_REG_DNI = "^\\d{8}(-|\\s|\\/)?[a-zA-z]$";

    /**
     * Método para verificar si un DNI es válido.
     * @param dni el DNI a verificar.
     * @return true si el DNI es válido, false de lo contrario.
     */

    public static boolean checkDni(String dni) {
        // Elimina espacios en blanco
        String newDni = dni.trim().toUpperCase().replaceAll("\\s", "");

        Pattern pattern = Pattern.compile(EXP_REG_DNI);
        Matcher matcher = pattern.matcher(newDni);
        return matcher.find(); // Devuelve true si encuentra una coincidencia con la expresión regular, false de lo contrario
    }



}
