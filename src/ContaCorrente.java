import Constants.TipoConta;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente, Banco banco, double limiteSaque) {
        super(cliente, banco, limiteSaque);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL++;
        super.tipoconta = TipoConta.CONTA_CORRENTE;
    }
}