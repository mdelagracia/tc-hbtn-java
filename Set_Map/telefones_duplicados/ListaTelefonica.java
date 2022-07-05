import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ListaTelefonica {
    HashMap<String, TreeSet<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone novoTelefone) {
        TreeSet<Telefone> lista = telefones.get(nome); //retorna dentro do hashmap o valor vinculado ao nome

        if (lista == null) { // verificar se existe algum numero na lista
            lista = new TreeSet<Telefone>();// se nao existe, inicializa uma nova lista em branco
        } else {
            if (lista.contains(novoTelefone)) {
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }

            for(String chaveNomePessoa : telefones.keySet()){
                if (nome == chaveNomePessoa)
                    continue;
                if(telefones.get(chaveNomePessoa).contains(novoTelefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        lista.add(novoTelefone);// por fim adiciona o novo numero de telefone na lista

        telefones.put(nome, lista); //adicionando a lista no map
    }

    public TreeSet<Telefone> buscar(String nome) {
        return telefones.get(nome);
    }

}