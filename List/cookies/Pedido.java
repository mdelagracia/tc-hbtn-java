import java.util.ArrayList;

public class Pedido {
    ArrayList<PedidoCookie> cookies;
    int quantidadeRemovidos = 0;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }


    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.quantidadeCaixas;
        }
        return total - quantidadeRemovidos;
    }

    public int removerSabor(String sabor) {
       int quantidadeRemovidos = 0;
       for (int i = 0; i <= cookies.size()-1; i++){
           if(cookies.get(i).sabor == sabor){
               quantidadeRemovidos+=cookies.get(i).quantidadeCaixas;
               cookies.remove(i);
           }
       }
        return quantidadeRemovidos;

    }
}


