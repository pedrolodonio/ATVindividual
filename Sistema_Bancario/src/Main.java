import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Banco banco = new Banco();

        Loja LojaX = new Loja("Loja X", 0.0);
        Loja LojaY = new Loja("Loja Y", 0.0);

        Funcionario [] funcionarios = new Funcionario[4];

        funcionarios[0] = new Funcionario("Chloe", LojaX);
        funcionarios[1] = new Funcionario("Sam", LojaX);
        funcionarios[2] = new Funcionario("Sophia", LojaY);
        funcionarios[3] = new Funcionario("Marcus", LojaY);

        LojaX.contratacao(funcionarios[0],0);
        LojaX.contratacao(funcionarios[1],1);
        LojaY.contratacao(funcionarios[2],0);
        LojaY.contratacao(funcionarios[3],1);

        funcionarios[0].start();
        funcionarios[1].start();
        funcionarios[2].start();
        funcionarios[3].start();

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

            clientes[i] = new Cliente(nomesClientes.get(i), LojaX, LojaY,banco);

            clientes[i].start();

        }

        try {
            for (Cliente cliente : clientes){
                
                cliente.join();

            }

        funcionarios[0].join();
        funcionarios[1].join();
        funcionarios[2].join();
        funcionarios[3].join();



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos os funcionários e clientes finalizaram suas operações");

    }
}
