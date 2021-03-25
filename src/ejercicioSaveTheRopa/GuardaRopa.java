package ejercicioSaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Integer cont=0;
    private HashMap<Integer, List<Prenda>> diccionario = new HashMap<Integer, List<Prenda>>();
    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        diccionario.put(cont, listaDePrenda);
        cont++;
        return cont-1;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer, List<Prenda>> x:diccionario.entrySet()) {

            System.out.println("ID: "+ x.getKey());
            System.out.println("Prendas: ");
            for (Prenda p:x.getValue()) {
                System.out.println(p);
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        try {
            return diccionario.get(numero);
        }catch (Exception e){
            System.out.println("No se encontró la prenda");
            return null;
        }
    }




}
