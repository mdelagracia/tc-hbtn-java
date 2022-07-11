import java.util.*;


public abstract class Armazem<T> implements Armazenavel<T>{
    Map<String, T> itensArmazem;

    public Armazem() {
        this.itensArmazem = new TreeMap<>();
    }

    @Override
    public abstract void adicionarAoInventario(String nome, T item);

    @Override
    public abstract T obterDoInventario(String nome);

}
