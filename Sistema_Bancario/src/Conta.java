

public class Conta {

    private double saldo ;

    public Conta ( double saldo_inicial){

        this.saldo = saldo_inicial ;

    }

    public synchronized void depositar (double dinheiro){

        if (dinheiro > 0){

        saldo += dinheiro ;

        System.out.println(Thread.currentThread()+"foram depositados R$ " + dinheiro + "na sua conta");

    } 
    else {
        System.out.println("este valor não é válido para a realização do depósito");
    }


}
}
