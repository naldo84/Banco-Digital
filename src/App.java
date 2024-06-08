public class App {
    public static void main(String[] args) throws Exception {
        // Criação do banco
        Banco banco1 = new Banco(211, "Naldo's Bank");

        // Criação de clientes
        Cliente jose = new Cliente("Cirilo Silva", "43217");
        Conta contaCC = new ContaCorrente(jose, banco1, 100);
        Conta contaPoup = new ContaPoupanca(jose, banco1, 100);

        Cliente pedro = new Cliente("Pedro Silva", "12345");
        Conta contaCC2 = new ContaCorrente(pedro, banco1, 50);

        Cliente maria = new Cliente("Maria Joaquina", "223344");
        Conta ccMaria = new ContaCorrente(maria, banco1, 100);

        imprimirTexto("IMPRESSAO DE EXTRATO");
        contaCC.imprimirExtrato();
        System.out.println("");
        contaPoup.imprimirExtrato();
        System.out.println();
        contaCC2.imprimirExtrato();

        imprimirTexto("DEPOSITANDO VALOR");
        contaPoup.depositar(50);
        contaPoup.consultarSaldo();

        imprimirTexto("TRANSFERINDO VALOR");
        contaPoup.transferir(20, contaCC);

        imprimirTexto("PAGANDO CONTAS");
        contaPoup.pagarConta(12);
        contaPoup.consultarSaldo();

        imprimirTexto("SACANDO VALOR");
        contaCC2.sacar(20, true);
        contaCC2.consultarSaldo();

        System.out.println();
        contaCC2.sacar(20, true);
        contaCC2.consultarSaldo();
        contaCC.sacar(-10, true);
        contaCC2.sacar(51, true);

        System.out.println();
        ccMaria.depositar(500);
        ccMaria.consultarSaldo();
        ccMaria.sacar(101, true);
        ccMaria.consultarSaldo();
        ccMaria.sacar(50, true);
        ccMaria.consultarSaldo();

        imprimirTexto("RELAÇÃO DE CONTAS");
        banco1.imprimirRelacaoContas();
    }

    public static void imprimirTexto(String msg) {
        System.out.println("----------------------------------------");
        System.out.println("           " + msg);
        System.out.println("----------------------------------------");
    }
}
