public class Conta {

    private double saldo ;

    public Conta ( double saldo_inicial){

        this.saldo = saldo_inicial ;

    }

    public synchronized void deposito (double valor){

        if (valor > 0){

        saldo += valor ;
        
        System.out.println(Thread.currentThread().getName()+" foram depositados R$ " + valor + " na sua conta");

    } 
    else {
        System.out.println("Este valor não é válido para a realização do depósito");
    }
    }

    public synchronized boolean saque (double valor){

        if (valor > 0 && saldo >= valor) {

            saldo -= valor ;

            System.out.println(Cliente.currentThread().getName()+" sacou R$" + valor + " . Seu saldo foi atualizado para R$" + saldo);

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

