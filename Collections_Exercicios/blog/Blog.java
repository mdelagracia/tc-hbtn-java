import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        postagens.add(post);
    }

    public TreeSet<String> obterTodosAutores(){
        TreeSet<String> autores = new TreeSet<>();
        for(Post post:postagens){
            autores.add(post.getAutor());
        }
        return autores;
    }

    public TreeMap<String, Integer> obterContagemPorCategoria(){
        TreeMap<String, Integer> categorias = new TreeMap<>();
        for(Post post: postagens){
            if(categorias.isEmpty()){
                categorias.put(post.getCategoria(), 1);
            }else{
                if(categorias.containsKey(post.getCategoria())){
                    Integer auxiliar = categorias.get(post.getCategoria());
                    categorias.replace(post.getCategoria(),auxiliar+1);
                }else{
                    categorias.put(post.getCategoria(), 1);
                }
            }
        }
        return categorias;
    }
}
