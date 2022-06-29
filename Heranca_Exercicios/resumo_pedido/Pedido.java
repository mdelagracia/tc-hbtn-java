import java.text.DecimalFormat;

public class Pedido {
    protected double percentualDesconto;
    protected ItemPedido[] itens;
    protected double valorTotal;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularDesconto(){
        return percentualDesconto / 100 * calcularPrecoProdutos();
    }

    public double calcularPrecoProdutos() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.produto.obterPrecoLiquido() * item.quantidade;

        }
        return total;
    }

    public double calcularTotal() {

      valorTotal = calcularPrecoProdutos();
        valorTotal -= calcularDesconto();
        return valorTotal;
    }

    public void apresentarResumoPedido() {

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",item.produto.getClass().getSimpleName(),item.produto.titulo, item.produto.obterPrecoLiquido(), item.quantidade, (item.produto.obterPrecoLiquido() * item.quantidade));
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", calcularDesconto());
        System.out.printf("TOTAL PRODUTOS: %.2f\n", calcularPrecoProdutos());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }
}
