import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{
    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo, autor, preco);
    }
    @Override
    public double getPreco() {
        double acrescimo = 0;
        acrescimo = preco * 0.3;
        return preco + acrescimo;
    }

}
