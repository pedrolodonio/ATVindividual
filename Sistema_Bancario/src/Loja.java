
public class Loja {

    private String nomeLoja;
    private Conta contaLoja;
    private Funcionario[] funcionarios;

    public Loja(String nomeLoja, double saldo_inicial) {

        this.nomeLoja = nomeLoja;
        this.contaLoja = new Conta(0.0);
        this.funcionarios = new Funcionario[2];
    }

    public synchronized void contratacao(Funcionario trabalhador, int n) {

        if (n >= 0 && n < funcionarios.length) {
            funcionarios[n] = trabalhador;
            System.out.println(trabalhador.getNome() + " foi contratado para a  " + nomeLoja);
        }

    }

    public synchronized void realizaVenda(double dinheiro) {

        contaLoja.deposito(dinheiro);
        // System.out.println(nomeLoja + " vendeu um produto para " + Thread.currentThread().getName() + " e recebeu R$" + dinheiro + " saldo atual: R$ " + contaLoja.consultaSaldo());

    }

    public synchronized void efetuaPagamento() {

        double salario = 1400.00;

        for (Funcionario trabalhador : funcionarios) {
            if (trabalhador != null && contaLoja.consultaSaldo() >= salario) {

                contaLoja.saque(salario);
                trabalhador.recebeSalario(salario);

                System.out.println(trabalhador.getNome() + " recebeu seu pagamento . O saldo atual da " + getNomeLoja() + " é de R$ " + String.format("%.2f", contaLoja.consultaSaldo()));
            }
        }
    }

    public double consultaSaldo() {
        return contaLoja.consultaSaldo();
    }

    public String getNomeLoja() {
        return nomeLoja;
    }
}
