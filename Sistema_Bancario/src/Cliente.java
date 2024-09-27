import java.util.Random;

public class Cliente extends Thread {

    private String nomeCliente;
    private Conta conta;
    private Loja LojaX;
    private Loja LojaY;
    private Random compras;

    public Cliente(String nomeCliente,Loja LojaX, Loja LojaY){

        this.nomeCliente = nomeCliente;
        this.conta = new Conta(2000.00);
        this.LojaX = LojaX;
        this.LojaY = LojaY;
        this.compras = new Random();

    }

    @Override

        public void run () {
            
            try{
                
                for (int i = 0; i < 2 ; i++){

                    fazCompra(LojaX);

                }

                for (int i = 0; i < 2 ; i++){

                    fazCompra(LojaY);

                }

            }

            catch (InterruptedException e)
            {

                e.printStackTrace();

            }
        }

    private void fazCompra(Loja loja) throws    InterruptedException {

        double valorCompra = 200 + (300 * compras.nextDouble());

        if (conta.consultaSaldo() >= valorCompra){

            conta.saque(valorCompra);
            loja.realizaVenda(valorCompra);

            System.out.println(nomeCliente + "fez uma compra na loja " + loja.getNomeLoja() + "e custou R$ " + valorCompra);
        }
        
        else{

            System.out.println("Não foi possível realizar a compra pois o saldo é insuficiente");

        }
        
       

    }

    public String getnomeCliente(){

        return nomeCliente;

    }


}
