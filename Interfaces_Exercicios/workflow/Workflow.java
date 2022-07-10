import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    List<Atividade> listaAtividades;

    public Workflow() {
        this.listaAtividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade){
        listaAtividades.add(atividade);
    }
}
