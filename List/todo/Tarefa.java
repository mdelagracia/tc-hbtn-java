public class Tarefa {
    public String descricao;
    public boolean estahFeita;
    public int identificador;

    public Tarefa(String descricao, int identificador) {
        setDescricao(descricao);
        this.identificador = identificador;
    }

    public void setDescricao(String descricao) {
        modificarDescricao(descricao);
    }

    public void modificarDescricao(String descricao){
        if(descricao == null || descricao.isEmpty()){
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        else{
            this.descricao = descricao;
        }
    }
}
