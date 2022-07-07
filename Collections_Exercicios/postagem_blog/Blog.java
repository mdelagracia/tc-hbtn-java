import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        if (postagens.isEmpty()) {
            postagens.add(postagem);
        } else {
            for (Post post : postagens) {
                if (post.getAutor().equals(postagem.getAutor()) && post.getTitulo().equals(postagem.getTitulo())) {
                    throw new IllegalArgumentException("Postagem jah existente");
                }
            }
            postagens.add(postagem);
        }
    }

    public TreeSet<Autor> obterTodosAutores() {
        TreeSet<Autor> autores = new TreeSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public TreeMap<Categorias, Integer> obterContagemPorCategoria() {
        TreeMap<Categorias, Integer> categorias = new TreeMap<>();
        for (Post post : postagens) {
            if (categorias.isEmpty()) {
                categorias.put(post.getCategoria(), 1);
            } else {
                if (categorias.containsKey(post.getCategoria())) {
                    Integer auxiliar = categorias.get(post.getCategoria());
                    categorias.replace(post.getCategoria(), auxiliar + 1);
                } else {
                    categorias.put(post.getCategoria(), 1);
                }
            }
        }
        return categorias;
    }

    public TreeSet<Post> obterPostsPorAutor(Autor autor){
        TreeSet<Post> autores = new TreeSet<>();
        for(Post post:postagens){
            if(post.getAutor().getNome().equals(autor.getNome())
                    && post.getAutor().getSobrenome().equals(autor.getSobrenome())){
                autores.add(post);
            }
        }
        return autores;
    }

    public TreeSet<Post> obterPostsPorCategoria(Categorias categoria){
        TreeSet<Post> categorias = new TreeSet<>();
        for(Post post:postagens){
            if(post.getCategoria().equals(categoria)){
                categorias.add(post);
            }
        }
        return categorias;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> listaCategorias = new TreeMap<>();
        Set<Post> valorPost;

        for(int i=0; i<postagens.size(); i++){
            valorPost = new TreeSet<>();
            for(Post post: postagens){
                if(postagens.get(i).getCategoria().equals(post.getCategoria())){
                    valorPost.add(post);
                }
            }
            listaCategorias.put((postagens.get(i).getCategoria()),valorPost);
        }
        return listaCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> listaAutores = new TreeMap<>();
        Set<Post> postsAutor;

        for(int i=0; i<postagens.size(); i++){
            postsAutor = new TreeSet<>();
            for(Post post: postagens){
                if(postagens.get(i).getAutor().equals(post.getAutor())){
                    postsAutor.add(post);
                }
            }
            listaAutores.put((postagens.get(i).getAutor()),postsAutor);
        }
        return listaAutores;
    }
}
