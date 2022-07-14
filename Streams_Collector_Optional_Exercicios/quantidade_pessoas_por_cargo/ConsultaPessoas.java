import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {

        TreeMap<String, TreeSet<Pessoa>> pessoasAgrupadas = pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,
                        () -> new TreeMap<>(Collections.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)));
        return pessoasAgrupadas;

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        Map<String, Long> contagemPessoas = pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,
                       Collectors.counting()));
        return contagemPessoas;
    }

}
