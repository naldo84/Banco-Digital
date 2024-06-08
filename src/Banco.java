import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int codigo;
    private List<Conta> contas;

    public Banco(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void imprimirRelacaoContas() {
        System.out.println("Relação de contas do " + this.nome);
        for (Conta c : contas) {
            System.out.printf("Titular: %s Conta: %d - Tipo: %s\n", c.cliente.nome, c.numeroConta, c.tipoconta);

        }
    }
}
