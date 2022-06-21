import comida.*;
import humor.*;

public class Personagem {
    protected Humor humor;
    protected int pontosDeFelicidade;

    public void comer (Comida[] comidas){
        for (Comida comida : comidas) {
             pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
        humor = obterHumorAtual();
    }

    public Humor obterHumorAtual(){
        if(pontosDeFelicidade <= -5) return new Irritado();
        else if  (pontosDeFelicidade > -5 && pontosDeFelicidade <= 0) return new Triste();
        else if  (pontosDeFelicidade > 1 && pontosDeFelicidade <= 15 ) return new Feliz();
        else  return new MuitoFeliz();
        }

    @Override
    public String toString(){
        return pontosDeFelicidade + " - " + humor.getClass().getSimpleName();
    }
}
