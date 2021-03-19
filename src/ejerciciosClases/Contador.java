package ejerciciosClases;

public class Contador {
    private int num;

    public Contador(int num) {
        this.num = num;
    }

    public Contador() {
        num = 0;
    }

    public Contador(Contador cont){

    }

    public void incrementar() {
        setNum(getNum()+1);
    }

    public void decrementar() {
        setNum(getNum()-1);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
