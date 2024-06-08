import Constants.TipoConta;

public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected TipoConta tipoconta;
    protected Cliente cliente;
    protected Banco banco;
    protected double limiteSaque;

    public Conta(Cliente cliente, Banco banco, double limiteSaque) {
        this.cliente = cliente;
        this.banco = banco;
        banco.adicionarConta(this);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacar(double valor, boolean exibirMensagem) {
        if (valor < 0) {
            if (exibirMensagem) {
                System.out.println("Informe um valor positivo!");
            }
        } else if (valor > limiteSaque) {
            if (exibirMensagem) {
                System.out.println("Valor de saque excede o limite diário!");
            }
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            if (exibirMensagem) {
                System.out.println("Saque efetuado com sucesso!");
            }

        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // double saldoAntes = this.saldo;

        this.sacar(valor, false);

        if (saldo >= valor) {
            contaDestino.depositar(valor);
            System.out.println("Transferência Efetuada com sucesso para " + contaDestino.cliente.nome);
        } else {
            System.out.println("Transferência não realizada");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consulta de Saldo - " + this.tipoconta);
        System.out.println("Titular: " + cliente.nome);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" -- " + banco.getNome() + " --");
        System.out.printf("Extrato da %s", this.tipoconta);
        System.out.printf("\nTitular: %s", cliente.nome);
        System.out.printf("\nAgência: %d", this.agencia);
        System.out.printf("\nConta: %d", this.numeroConta);
        System.out.printf("\nSaldo: R$ %.2f\n", this.saldo);
    }

    @Override
    public void pagarConta(double valor) {
        if (valor <= this.saldo) {
            saldo -= valor;
            System.out.println("Pagamento efetuado!!");
        } else {
            System.out.println("Saldo insuficiente para efetuar o pagamento");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoconta;
    }

}
