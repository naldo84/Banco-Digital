public class App {
    public static void main(String[] args) throws Exception {
        Conta contaCC = new ContaCorrente();
        Conta contaPoup = new ContaPoupanca();

        Conta contaCC2 = new ContaCorrente();

        contaCC.imprimirExtrato();
        System.out.println("");
        contaPoup.imprimirExtrato();

        contaPoup.depositar(50);        
        contaPoup.transferir(10, contaCC);

        System.out.println("");
        contaCC.imprimirExtrato();
        System.out.println("");
        contaPoup.imprimirExtrato();
        System.out.println();
        contaCC2.imprimirExtrato();
        
    }
}
