import java.util.Objects;

public class Contato {
    private String nome;
    private String numeroTelefone;
    private TipoNumero tipo;

    public Contato(String nome, String numeroTelefone, TipoNumero tipo) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TipoNumero getTipo() {
        return tipo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
