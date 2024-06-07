import Constants.TipoConta;

public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 1000;

    public ContaPoupanca(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL++;
        super.tipoconta = TipoConta.CONTA_POUPANCA;
    }
}
