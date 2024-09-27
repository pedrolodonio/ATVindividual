import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Banco banco = new Banco();

        Loja LojaX = new Loja("Loja X", 0.0);
        Loja LojaY = new Loja("Loja Y", 0.0);

        List<String> nomesClientes = new ArrayList<> ();
        nomesClientes.add("Taylor");
        nomesClientes.add("James");
        nomesClientes.add("Augusta");
        nomesClientes.add("Betty");
        nomesClientes.add("Inês");
        nomesClientes.add("Erica");
        nomesClientes.add("John");
        nomesClientes.add("Pedro");
        nomesClientes.add("Lucas");
        nomesClientes.add("David");

        Cliente [] clientes = new Cliente[nomesClientes.size()];
        for (int i = 0; i < clientes.length; i++) {

            clientes[i] = new Cliente(nomesClientes.get(i), LojaX, LojaY);

            clientes[i].start();

        }
        

    }
}
