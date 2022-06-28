import produtos.*;

public class Pedido {
    protected double percentualDesconto;
    protected ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
           valorTotal += item.produto.obterPrecoLiquido() * item.quantidade ;

        }
        valorTotal -= percentualDesconto/100 * valorTotal;
        return valorTotal;
    }

}
