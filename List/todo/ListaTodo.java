import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    List<Tarefa> tarefas = new ArrayList<>();

    public ListaTodo() {

    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa item : tarefas) {
            if (item.identificador == tarefa.identificador) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.identificador + " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
        }


    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.identificador == identificador) {
                tarefa.estahFeita =  true;
                return true;
            }
        }
        return false;
    }


    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.identificador == identificador) {
                tarefa.estahFeita = false;
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa != null) {
                tarefa.estahFeita = false;
            }
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa != null) {
                tarefa.estahFeita = true;
            }
        }
    }

    public void listarTarefas() {

        for (Tarefa tarefa : tarefas) {
            String marcador;
            if (tarefa.estahFeita) {
                marcador = "X";
            } else {
                marcador = " ";
            }
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", marcador, tarefa.identificador, tarefa.descricao);

        }
    }
}

