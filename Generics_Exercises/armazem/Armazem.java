import java.util.*;


public class Armazem<T> implements Armazenavel<T>{
    Map<String, T> itensArmazem;

    public Armazem() {
        this.itensArmazem = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T item) {
        itensArmazem.put(nome, item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itensArmazem.get(nome);
    }

}
