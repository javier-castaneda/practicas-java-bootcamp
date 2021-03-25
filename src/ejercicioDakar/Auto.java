package ejercicioDakar;

public class Auto extends Vehiculo{
    public Auto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }

    @Override
    public String toString() {
        return "Auto:{"+
                "velocidad=" + getVelocidad() +
                ", aceleracion=" + getAceleracion() +
                ", anguloDeGiro=" + getAceleracion() +
                ", patente='" + getPatente() + '\'' +
                '}';
    }
}
