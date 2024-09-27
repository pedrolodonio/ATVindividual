import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Banco banco = new Banco();

        Loja LojaX = new Loja("Loja X", 0.0);
        Loja LojaY = new Loja("Loja Y", 0.0);

        Funcionario funcionario1 = new Funcionario("Chloe");
        Funcionario funcionario2 = new Funcionario("Sam");
        Funcionario funcionario3 = new Funcionario("Sofia");
        Funcionario funcionario4 = new Funcionario("Marcus");

        LojaX.contratacao(funcionario1, 0);
        LojaX.contratacao(funcionario2, 1);
        LojaY.contratacao(funcionario3, 0);
        LojaY.contratacao(funcionario4, 1);

        List<String> nomesClientes = new ArrayList<> ();
        nomesClientes.add("Taylor");
        nomesClientes.add("James");
        nomesClientes.add("Augustine");
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

        funcionario1.start();
        funcionario2.start();
        funcionario3.start();
        funcionario4.start();

        
        

    }
}
