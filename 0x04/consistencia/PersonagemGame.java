public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int tomarDano(int quantidadeDeDano) {

        int saude = getSaudeAtual()- quantidadeDeDano;
        setSaudeAtual(saude);
        return getSaudeAtual();
    }

    public PersonagemGame(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.setNome(nome);
    }

    public int receberCura(int quantidadeDeCura) {
        int saude = getSaudeAtual() + quantidadeDeCura;
        setSaudeAtual(saude);
        return getSaudeAtual();
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual <= 0) { saudeAtual = 0; status = "morto";}
        if (saudeAtual > 0) { status = "vivo";}
        if (saudeAtual > 100) {saudeAtual = 100;}
        this.saudeAtual = saudeAtual;
    }

    public void setNome(String nome) {
        if (nome !=null && !nome.isEmpty()){this.nome = nome;}

    }
}

