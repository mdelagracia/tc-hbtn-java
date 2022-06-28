import produtos.Livro;
import produtos.Produto;

public class ItemPedido {
    public int quantidade;
    public Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
