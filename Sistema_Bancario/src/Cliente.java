import java.util.Random;

public class Cliente implements Runnable {

    private String nomeCliente;
    private Conta conta;
    private Loja LojaX;
    private Loja LojaY;
    private Random compras = new Random();

    public Cliente(String nomeCliente,Loja LojaX, Loja LojaY){

        this.nomeCliente = nomeCliente;
        this.conta = new Conta(2000.00);

    }

    private void fazCompra(Loja loja) throws    InterruptedException {

        double valorCompra = 200 + (300 * compras.nextDouble());

        if (conta.consultaSaldo() >= valorCompra){

            conta.saque(valorCompra);
            loja.realizaVenda(valorCompra);

            System.out.println(nomeCliente + "fez uma compra na loja " + loja.getnomeLoja() + "e custou R$ " + valorCompra);
        }
        else{
            System.out.println("Não foi possível realizar a compra pois o saldo é insuficiente");
        }

    }


   


}
