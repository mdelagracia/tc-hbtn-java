import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        List<Produto> produtosFiltrados = new ArrayList<>();
        for(Produto item:produtos){
            if(criterioFiltro.testar(item)){
                produtosFiltrados.add(item);

            }
        }

        return produtosFiltrados;
    }
}
