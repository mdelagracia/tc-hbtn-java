import java.util.ArrayList;
import java.util.Objects;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nomeCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }
    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);
        if(cliente != null){
            cliente.adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }


    public boolean novoCliente(String nomeCliente, double transacaoInicial) {
        if(buscarCliente(nomeCliente) == null){
            clientes.add(new Cliente(nomeCliente,transacaoInicial));
            return true;
        }
        return false;

    }
}

