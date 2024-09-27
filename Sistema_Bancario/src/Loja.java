public class Loja {

    private Conta contaLoja;
    private Funcionario [] funcionarios ;

    public Loja (double saldo_inicial){

        this.contaLoja = new Conta(0.0);
        this.funcionarios = new Funcionario [2];
    }

    public synchronized contratacao (Funcionario trabalhador, int n ){

        if (n >= 0 && n < funcionarios.length){
            funcionarios [n] = trabalhador;
        }
        
    } 


}
