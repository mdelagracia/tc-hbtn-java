import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel {
    Map<String, T> itensArmazem;

    public Armazem() {
        this.itensArmazem = new HashMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, Object item) {
        itensArmazem.put(nome, (T) item);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itensArmazem.get(nome);
    }

}
