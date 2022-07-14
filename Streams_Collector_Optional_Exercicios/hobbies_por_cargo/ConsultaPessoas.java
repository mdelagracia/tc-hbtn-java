import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas){
        Map<String, Map<Integer, Long>> cargoEIdade = pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,
                        Collectors.groupingBy(Pessoa::getIdade,Collectors.counting())));
        return cargoEIdade;
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas){
        Map<String, Double> mediaSalario = pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,
                Collectors.averagingDouble(Pessoa::getSalario)));

                return mediaSalario;
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoas){
        Map<String, TreeSet<String>> hobbiesCargo = pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo,
                        Collectors.flatMapping(p -> p.getHobbies().stream(),
                                Collectors.toCollection(TreeSet::new))));
        return hobbiesCargo;
    }

}
