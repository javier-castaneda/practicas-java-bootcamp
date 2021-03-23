package ejerciciosInterfaces;

import java.util.Locale;

public class Celular implements Precedable<Celular> {
    private String numero;
    private String titular;

    public Celular(String numero, String titular) {
        this.numero = numero;
        this.titular = titular.toUpperCase(Locale.ROOT);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular.toUpperCase(Locale.ROOT);
    }

    @Override
    public int precedeA(Celular celular) {
        return this.getTitular().compareTo(celular.getTitular());
    }
}
