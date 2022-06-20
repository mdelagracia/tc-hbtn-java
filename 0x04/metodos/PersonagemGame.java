public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int tomarDano(int quantidadeDeDano) {

        int saude = saudeAtual - quantidadeDeDano;
        setSaudeAtual(saude);
        return saudeAtual;
    }

    public int receberCura(int quantidadeDeCura) {
        int saude = saudeAtual + quantidadeDeCura;
        setSaudeAtual(saude);
        return saudeAtual;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual < 0) { saudeAtual = 0;}
        if (saudeAtual > 100) {saudeAtual = 100;}
        this.saudeAtual = saudeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

