package ejerciciosClases;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Fraccion toFraccion(int val) {
        return new Fraccion(val, 1);
    }

    public static Fraccion suma(Fraccion a, Fraccion b) {
        int nume;
        int deno;
        if (a.getDenominador() == b.getDenominador()) {
            deno = a.getDenominador();
            nume = a.getNumerador()+b.getNumerador();
            return new Fraccion(nume, deno);
        } else {
            deno = a.getDenominador() * b.getDenominador();
        }
        nume = a.getNumerador() * b.getDenominador() + a.getDenominador() * b.getNumerador();
        return new Fraccion(nume, deno);
    }

    public static Fraccion suma(Fraccion a, int b) {
        Fraccion bFrac = Fraccion.toFraccion(b);
        return suma(a, bFrac);
    }

    public static Fraccion suma(int a, Fraccion b) {
        Fraccion aFrac = Fraccion.toFraccion(a);
        return suma(aFrac, b);
    }

    public static Fraccion resta(Fraccion a, Fraccion b) {
        int nume;
        int deno;
        if (a.getDenominador() == b.getDenominador()) {
            deno = a.getDenominador();
            nume = a.getNumerador()-b.getNumerador();
            return new Fraccion(nume, deno);
        } else {
            deno = a.getDenominador() * b.getDenominador();
        }
        nume = a.getNumerador() * b.getDenominador() - a.getDenominador() * b.getNumerador();
        return new Fraccion(nume, deno);
    }

    public static Fraccion resta(Fraccion a, int b) {
        Fraccion bFrac = Fraccion.toFraccion(b);
        return resta(a, bFrac);
    }

    public static Fraccion resta(int a, Fraccion b) {
        Fraccion aFrac = Fraccion.toFraccion(a);
        return resta(aFrac, b);
    }

    public static Fraccion multip(Fraccion a, Fraccion b) {
        int nume;
        int deno;
        nume = a.getNumerador() * b.getNumerador();
        deno = a.getDenominador() * b.getDenominador();
        return new Fraccion(nume, deno);
    }

    public static Fraccion multip(Fraccion a, int b) {
        Fraccion bFrac = new Fraccion(b, 1);
        return multip(a, bFrac);
    }

    public static Fraccion multip(int a, Fraccion b) {
        Fraccion aFrac = new Fraccion(a, 1);
        return multip(aFrac, b);
    }

    public static Fraccion div(Fraccion a, Fraccion b) {
        int nume;
        int deno;
        nume = a.getNumerador() * b.getDenominador();
        deno = a.getDenominador() * b.getNumerador();
        return new Fraccion(nume, deno);
    }

    public static Fraccion div(Fraccion a, int b) {
        Fraccion bFrac = new Fraccion(b, 1);
        return div(a, bFrac);
    }

    public static Fraccion div(int a, Fraccion b) {
        Fraccion aFrac = new Fraccion(a, 1);
        return div(aFrac, b);
    }

    @Override
    public String toString(){
        return numerador +"/" + denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}
