public interface IConta {
    void sacar(double valor, boolean exibirMensagem);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    void consultarSaldo();

    void pagarConta(double valor);
}
