package ejerciciosClases;

public class CuentaCorriente {
    //métodos ingreso, egreso, reintegro y transferencia.

    private double saldo;

    public CuentaCorriente() {
        saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        setSaldo(cuenta.getSaldo());
    }

    public void ingreso(double valor) {
        saldo += valor;
    }

    public boolean egreso(double valor) {
        if (valor > this.saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void reintegro(double valor) {
        ingreso(valor);
    }

    public boolean transferencia(double valor, CuentaCorriente cuenta) {
        if (valor <= this.saldo) {
            cuenta.ingreso(valor);
            this.egreso(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
