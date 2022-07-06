import java.util.HashMap;
import java.util.HashSet;


public class ListaTelefonica {
   private HashMap<String, HashSet<Telefone>> telefones;

    public ListaTelefonica() {
        this.telefones = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone novoTelefone) {
        HashSet<Telefone> lista = telefones.get(nome); //retorna dentro do hashmap o valor vinculado ao nome

        if (lista == null) { // verificar se existe algum numero na lista
            lista = new HashSet<Telefone>();// se nao existe, inicializa uma nova lista em branco
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
        return lista;
    }

    public HashSet<Telefone>  buscar(String nome){

        for (String lista : this.telefones.keySet() ) {

            if(lista.equals(nome)){
                return this.telefones.get(lista);
            }
        }
        return null;
    }

}
