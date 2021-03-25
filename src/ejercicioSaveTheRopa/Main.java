package ejercicioSaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prenda> misPrendas = new ArrayList<Prenda>();
        misPrendas.add(new Prenda("GAP", "Saco"));
        misPrendas.add(new Prenda("ZARA", "Pantalón"));

        GuardaRopa gr = new GuardaRopa();

        System.out.println("Se guardan las prendas en el espacio número: "+gr.guardarPrendas(misPrendas));

        gr.mostrarPrendas();


        System.out.println("Se sacan las prendas: ");
        for (Prenda p: gr.devolverPrendas(0)) {
            System.out.println(p);
        }
    }
}
