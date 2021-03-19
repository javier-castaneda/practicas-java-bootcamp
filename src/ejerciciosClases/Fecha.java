package ejerciciosClases;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            System.out.println("Se creó una fecha erronea");
        }
    }

    public void sumaDia() {

        if (correcta(dia, mes, anio)){
            LocalDate fecha = LocalDate.of(anio, mes, dia);
            fecha = fecha.plusDays(1);
            this.dia = fecha.getDayOfMonth();
            this.mes = fecha.getMonthValue();
            this.anio = fecha.getYear();
        }else{
            System.out.println("La fecha es incorrecta no se puede sumar un día");
        }

    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean correcta(int dia, int mes, int anio){
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
