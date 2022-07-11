public class ArmazemDeComida extends Armazem<Comida> {
    public ArmazemDeComida() {
    }

    @Override
    public void adicionarAoInventario(String nome, Comida item) {
    itensArmazem.put(nome,item);
    }

    @Override
    public Comida obterDoInventario(String nome) {
       return itensArmazem.get(nome);
    }
}
