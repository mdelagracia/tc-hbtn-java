public class ArmazemDeEletronico extends Armazem<Eletronico> {
    @Override
    public void adicionarAoInventario(String nome, Eletronico item) {
        itensArmazem.put(nome, item);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return itensArmazem.get(nome);
    }
}
