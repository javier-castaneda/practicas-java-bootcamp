package ejerciciosAbstract.pass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {
    private String contrasena;
    private String regex;


    public Password(String regex) {
        this.regex = regex;
        Pattern.compile(regex);
    }

    public void setContrasena(String contrasena) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contrasena);
        boolean mathcFound = matcher.find();
        if (mathcFound) {
            this.contrasena = contrasena;
            System.out.println("Se creó la contraseña correctamente");
        } else {
            System.out.println("No se pudo crear la contraseña");
            throw new IllegalArgumentException();
        }
    }
}
