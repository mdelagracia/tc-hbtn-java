import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao notificacao){
        canais.add(notificacao);
    }

    public void processar (Video video){
        for(CanalNotificacao canalNotificacao: canais){
            canalNotificacao.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
        }
    }
}
