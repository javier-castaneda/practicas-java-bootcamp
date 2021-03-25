package ejercicioDakar;

import java.util.ArrayList;

public class Carrera {

    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int maxVehiculosPermitidos;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private SocorristaAuto socorrAuto = new SocorristaAuto();
    private SocorristaMoto socorrMoto = new SocorristaMoto();


    public Carrera(double distancia, double premioEnDolares, String nombre, int maxVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.maxVehiculosPermitidos = maxVehiculosPermitidos;
    }

    public void darDeAltaAuto(double velocidad,double aceleracion, double anguloDeGiro, String patente){
        if(vehiculos.size() <maxVehiculosPermitidos){
            vehiculos.add(new Auto(velocidad, aceleracion,anguloDeGiro,patente));
        }else{
            System.out.println("La carrera ya se encuentra llena... No se puede inscribir el Auto");
        }
    }

    public void darDeAltaMoto(double velocidad,double aceleracion, double anguloDeGiro, String patente){
        if(vehiculos.size() <maxVehiculosPermitidos){
            vehiculos.add(new Moto(velocidad, aceleracion,anguloDeGiro,patente));
        }else{
            System.out.println("La carrera ya se encuentra llena... No se puede inscribir la Moto");
        }
    }

    public void eliminarVehiculo(Vehiculo v){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(v.equals(vehiculos.get(i))){
                vehiculos.remove(i);
                System.out.println("Se eliminó el vehiculo");
                return;
            }
        }
        System.out.println("No se encontró el vehículo");
    }

    public void eliminarVehiculoConPatente(String patente){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getPatente() == patente){
                vehiculos.remove(i);
                System.out.println("Se eliminó el vehiculo");
                return;
            }
        }
        System.out.println("No se encontró el vehiculo");
    }

    private double calculoGanador(Vehiculo v){
        return v.getVelocidad()*0.5*v.getAceleracion()/(v.getAnguloDeGiro()*(v.getPeso()-(double)v.getRuedas()*100));
    }

    public Vehiculo obtenerGanador(){
        if(vehiculos.size()>0){
            int winner = -1;
            double max = 0;

            for (int i = 0; i < vehiculos.size(); i++) {
                if(calculoGanador(vehiculos.get(i))>max){
                    max = calculoGanador(vehiculos.get(i));
                    winner = i;
                }
            }
            return vehiculos.get(winner);
        }else {
            return null;
        }
    }

    public void socorrerAuto(String patente){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getPatente() == patente){
                socorrAuto.socorrer((Auto) vehiculos.get(i));
                System.out.println("Se socorrió el Auto");
                return;
            }
        }
        System.out.println("No se encontró el vehiculo");
    }

    public void socorrerMoto(String patente){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getPatente() == patente){
                socorrMoto.socorrer((Moto) vehiculos.get(i));
                System.out.println("Se socorrió la Moto");
                return;
            }
        }
        System.out.println("No se encontró el vehiculo");
    }

}
