package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gestionEventosDeportivosUtils {

    private static final String EXP_REG_DNI = "^\\d{8}(-|\\s|\\/)[a-zA-z]$";

    public static boolean checkDni(String dni) {
        String newDni = dni.trim().toUpperCase().replaceAll("\\s", "");

        Pattern pattern = Pattern.compile(EXP_REG_DNI);
        Matcher matcher = pattern.matcher(newDni);
        return matcher.find();
    }



}
