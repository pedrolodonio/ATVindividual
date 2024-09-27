
public class Conta {

    private double saldo;

    public Conta(double saldo_inicial) {

        this.saldo = saldo_inicial;

    }

    public synchronized void deposito(double valor) {

        if (valor > 0) {

            saldo += valor;

        } else {

        }
    }

    public synchronized boolean saque(double valor) {

        if (valor > 0 && saldo >= valor) {

            saldo -= valor;

            return true;
        } else {

            return false;
        }

    }

    public synchronized double consultaSaldo() {

        return saldo;
    }

}
