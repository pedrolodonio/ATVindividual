public class Funcionario {

    private String nome;
    private Conta contaCorrente;
    private Conta contaInvestimentos;

    public Funcionario (String nome){
        this.nome = nome;
        this.contaCorrente = new Conta(0.0);
        this.contaInvestimentos = new Conta (0.0);
    }

    public synchronized void investimento (double dinheiro){

        contaInvestimentos.deposito(dinheiro);
        System.out.println(nome+ "fez um investimento de R$" + dinheiro);
    }

    public synchronized void  recebeSalario (double dinheiro){

        contaCorrente.deposito(dinheiro);
        System.out.println(nome+ "recebeu R$" + dinheiro);
        investimento(0.20*dinheiro);
    }

}
