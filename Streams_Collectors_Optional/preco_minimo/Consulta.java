import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedidos) {
        List<Produto> livros = pedidos.produtos.stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).collect(toList());
        return livros;

    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
    List<Produto> produto = produtos.stream()
            .sorted(comparing(Produto::getPreco).reversed())
            .collect(toList());

        return produto.stream().findFirst().get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo){
        List<Produto> preco = produtos.stream()
                .filter(p -> p.getPreco() >= precoMinimo)
                .collect(toList());
        return preco;
    }
}
