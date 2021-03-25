package ejercicioMarteGroup;

public class InvitadoMeli extends Invitado{


    private double codigo;

    public InvitadoMeli(String name, double codigo) {
        super(name);
        this.codigo = codigo;
    }

    public void comerTorta(){
        System.out.println("ñom ñom ñom... Viva la Chiqui!!");
    }
}
