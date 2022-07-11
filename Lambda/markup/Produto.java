import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;

    public Produto(double preco, String nome ) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    private double preco;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup = () -> (preco*percentualMarkup/100) + preco;
    public Consumer<Double> atualizarMarkup = p -> {
      percentualMarkup = p;
    };
}
