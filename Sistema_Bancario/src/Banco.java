public class Banco {

    public Banco(){

    }

    public synchronized void transferencia (Conta remetente, Conta beneficiario, double dinheiro){

        if(remetente.saque(dinheiro)){
            beneficiario.deposito(dinheiro);
            System.out.println("Você transferiu R$ " + dinheiro + "para" + beneficiario );
        } 
        
        else{
            System.out.println("saldo insuficiente para realização da transferência");
        }

    }
}
