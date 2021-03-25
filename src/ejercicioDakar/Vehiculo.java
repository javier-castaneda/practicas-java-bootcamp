package ejercicioDakar;

import java.util.Objects;

public class Vehiculo {

    private double velocidad;
    private double aceleracion;
    private double anguloDeGiro;
    private String patente;
    private double peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, double anguloDeGiro, String patente, double peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Double.compare(vehiculo.velocidad, velocidad) == 0 && Double.compare(vehiculo.aceleracion, aceleracion) == 0 && Double.compare(vehiculo.anguloDeGiro, anguloDeGiro) == 0 && Double.compare(vehiculo.peso, peso) == 0 && ruedas == vehiculo.ruedas && patente.equals(vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, aceleracion, anguloDeGiro, patente, peso, ruedas);
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }

}
