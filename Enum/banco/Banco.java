import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) == null) {
            agencias.add(new Agencia(nomeAgencia));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            if (agencia.buscarCliente(nomeCliente) == null) {
                agencia.novoCliente(nomeCliente, transacaoInicial);
                return true;
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            Cliente cliente = agencia.buscarCliente(nomeCliente);
            if (cliente != null) {
                agencia.adicionarTransacaoCliente(nomeCliente,valorTransacao);
                return true;
            }
        }
        return false;

    }

    public boolean listarClientes(String nomeAgencia, boolean imprimir) {

        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            for(int i = 0; i < agencia.getClientes().size(); i++){
                Cliente cliente = agencia.getClientes().get(i);
                if(imprimir == false){
                    System.out.println("Cliente: " + cliente.getNome() + " [" + (i + 1) + "]");
                }else{
                    System.out.println("Cliente: " + cliente.getNome() + " [" + (i + 1) + "]");
                    for(int j = 0; j < cliente.getTransacoes().size(); j++){
                        System.out.println("  [" + (j + 1) + "] valor " + cliente.getTransacoes().get(j));
                    }
                }
            }



            return true;
        }
        return false;
    }
}
