import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> produtoPredicate) {
        List<Produto> produtosFiltrados = new ArrayList<>();
        for(Produto item:produtos){
            if(produtoPredicate.test(item)){
                produtosFiltrados.add(item);

            }
        }

        return produtosFiltrados;
    }
}
