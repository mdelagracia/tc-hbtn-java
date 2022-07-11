public class Comida {
    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "["+nome+"] " + String.format("%.6f",calorias) + " R$ " + String.format("%.6f",preco);
    }
}
