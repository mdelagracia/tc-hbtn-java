import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void registrarCanal(CanalNotificacao notificacao){
        canais.add(notificacao);
    }

    public void processar (Video video){
        for(CanalNotificacao canalNotificacao: canais){
            canalNotificacao.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
        }
    }
}
