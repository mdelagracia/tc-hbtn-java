import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigo;
    List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.cliente = cliente;
    }
}
