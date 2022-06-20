public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentar() {
        System.out.printf("Codigo: %s%n", codigo);
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Bairro: %s%n", endereco.getBairro());
        System.out.printf("Cidade: %s%n", endereco.getCidade());
        System.out.printf("Pais: %s", endereco.getPais());
    }
}
