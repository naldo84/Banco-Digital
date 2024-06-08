import Constants.TipoConta;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1000;

    public ContaPoupanca(Cliente cliente, Banco banco, double limiteSaque) {
        super(cliente, banco, limiteSaque);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL++;
        super.tipoconta = TipoConta.CONTA_POUPANCA;
    }
}
