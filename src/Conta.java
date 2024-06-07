import Constants.TipoConta;

public abstract class Conta implements IConta{
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected TipoConta tipoconta;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

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
