package ejercicioMarteGroup;

import java.util.ArrayList;

public class MainFiesta {

    public static void apagarVelas(ArrayList<Invitado> inv, ArrayList<Explotable> exp){
        explotarTodo(exp);
        repartirTorta(inv);
    }

    private static void repartirTorta(ArrayList<Invitado> in) {
        for (Invitado inv:in
             ) {
            inv.comerTorta();
        }
    }

    private static void explotarTodo(ArrayList<Explotable> e) {
        for (Explotable ex:e
             ) {
            ex.explotar();
        }
    }

    private static int contarExplosivos(ArrayList<Explotable> e){
        int suma = 0;
        for (Explotable ex:e
             ) {
            suma += ex.contar();
        }
        return suma;
    }

    public static void main(String[] args) {
        ArrayList<Invitado> listaInvitados =  new ArrayList<Invitado>();
        listaInvitados.add(new InvitadoMeli("Juan", 124124));
        listaInvitados.add(new InvitadoMeli("Pedro", 51321));
        listaInvitados.add(new InvitadoMeli("Daniela", 16436));
        listaInvitados.add(new InvitadoMeli("Andrea", 4732));
        listaInvitados.add(new Invitado("Mateo"));
        listaInvitados.add(new Invitado("Marcos"));
        listaInvitados.add(new Invitado("Ana"));

        ArrayList<Explotable> fuegosArt = new ArrayList<Explotable>();
        fuegosArt.add(new FuegoArtificial("Boom!"));
        fuegosArt.add(new FuegoArtificial("Boom!"));
        fuegosArt.add(new FuegoArtificial("Pow!"));
        fuegosArt.add(new FuegoArtificial("Kaboom!"));

        ArrayList<Explotable> pack1 = new ArrayList<Explotable>();
        pack1.add(new FuegoArtificial("Pew!"));
        pack1.add(new FuegoArtificial("Bam!"));
        pack1.add(new FuegoArtificial("Peeeeew!"));

        ArrayList<Explotable> pack2 = new ArrayList<Explotable>();
        pack2.add(new PackFuegos(pack1));
        pack2.add(new FuegoArtificial("BOOOOOM!!!"));
        pack2.add(new FuegoArtificial("pew pew POW!"));
        pack2.add(new FuegoArtificial("POOOOW!"));

        fuegosArt.add(new PackFuegos(pack1));
        fuegosArt.add(new PackFuegos(pack2));

        System.out.println("Se harán explotar en total "+ contarExplosivos(fuegosArt) +" Fuegos artificiales");

        apagarVelas(listaInvitados, fuegosArt);

    }
}
