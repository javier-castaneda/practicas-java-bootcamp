package ejerciciosInterfaces;

import java.util.Locale;

public class Persona implements Precedable<Persona> {

    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre.toUpperCase(Locale.ROOT);
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public int precedeA(Persona persona) {
        return this.getDni().compareTo(persona.getDni());
    }
}
