package ejercicioMarteGroup;

import java.util.ArrayList;

public class PackFuegos implements Explotable{

    private ArrayList<Explotable> fuegos =  new ArrayList<Explotable>();

    public PackFuegos(ArrayList<Explotable> fuegos) {
        this.fuegos = fuegos;
    }

    @Override
    public void explotar() {
        for (Explotable x:fuegos) {
            x.explotar();
        }
    }

    @Override
    public int contar() {
        int suma = 0;
        for (int i = 0; i < fuegos.size(); i++) {
            suma += fuegos.get(i).contar();
        }
        return suma;
    }
}
