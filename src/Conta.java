import Constants.TipoConta;

public abstract class Conta implements IConta{
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected TipoConta tipoconta;

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        System.out.printf("Extrato da %s", this.tipoconta);
        System.out.printf("\nAgência: %d", this.agencia);
        System.out.printf("\nConta: %d", this.numeroConta);
        System.out.printf("\nSaldo: R$ %.2f\n", this.saldo);
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

    public TipoConta getTipoConta(){
        return tipoconta;
    }
}
