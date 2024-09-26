

public class Conta {

    private double saldo ;

    public Conta ( double saldo_inicial){

        this.saldo = saldo_inicial ;

    }

    public synchronized void deposito (double dinheiro){

        if (dinheiro > 0){

        saldo += dinheiro ;

        System.out.println(Thread.currentThread()+"foram depositados R$ " + dinheiro + " na sua conta");

    } 
    else {
        System.out.println("Este valor não é válido para a realização do depósito");
    }
    }

    public synchronized boolean saque (double dinheiro){

        if (dinheiro > 0 && saldo >= dinheiro) {

            saldo -= dinheiro ;

            System.out.println(Thread.currentThread()+"Você sacou R$" + dinheiro + " da sua conta. Seu saldo foi atualizado para R$" + saldo);

            return true ;
        }
    
        else{

            System.out.println(Thread.currentThread() + "saldo insuficiente para realizar a operação de saque. Seu saldo atual é de R$" + saldo);

            return false;
        }

        
    }

    public synchronized double consultaSaldo (){

        return saldo;
    }

}

