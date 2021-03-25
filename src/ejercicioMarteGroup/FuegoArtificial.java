package ejercicioMarteGroup;

public class FuegoArtificial implements Explotable {
    private String sonido;

    public FuegoArtificial(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void explotar() {
        System.out.println(sonido);
    }

    @Override
    public int contar() {
        return 1;
    }
}
