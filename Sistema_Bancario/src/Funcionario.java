public class Funcionario extends Thread {

    private String nome;
    private Conta contaCorrente;
    private Conta contaInvestimentos;
    private Loja loja;
    private Banco banco;

    public Funcionario (String nome,Loja loja){
        this.nome = nome;
        this.contaCorrente = new Conta(0.0);
        this.contaInvestimentos = new Conta (0.0);
        this.loja = loja;
        this.banco = new Banco();
    }


    public synchronized void  recebeSalario (double dinheiro){

        contaCorrente.deposito(dinheiro);
        System.out.println(nome+ " recebeu R$" + dinheiro);
        banco.transferencia(contaCorrente, contaInvestimentos, dinheiro * 0.20);
        System.out.println(nome+ " investiu R$" + dinheiro * 0.20);

        
    }

    public String getNome(){
        return nome;
    }

    public double getSaldoCorrente(){
        return contaCorrente.consultaSaldo();
    }

    public double getSaldoInvestimentos(){
        return contaInvestimentos.consultaSaldo();
    }

    
    @Override

    public void run (){

        try{
            while(loja.consultaSaldo() < 1400){
                Thread.sleep(1000);
            }

            loja.efetuaPagamento();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
