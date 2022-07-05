import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    HashMap<String, ArrayList<Telefone>> telefones;

    public ListaTelefonica() {
        telefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> lista = telefones.get(nome); //retorna dentro do hashmap o valor vinculado ao nome

        if(lista == null){ // verificar se existe algum numero na lista
            lista = new ArrayList<Telefone>();// se nao existe, inicializa uma nova lista em branco
        }

        lista.add(telefone);// por fim adiciona o novo numero de telefone na lista

        telefones.put(nome, lista); //adicionando a lista no map
    }

    public ArrayList<Telefone> buscar(String nome){
        return telefones.get(nome);
    }

}
