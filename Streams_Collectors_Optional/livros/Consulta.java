import java.util.List;

import static java.util.stream.Collectors.toList;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedidos) {
        List<Produto> livros = pedidos.produtos.stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).collect(toList());
        return livros;
    }
}
