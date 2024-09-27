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

    public String getnomeCliente(){
        return nomeCliente;
    }



}
