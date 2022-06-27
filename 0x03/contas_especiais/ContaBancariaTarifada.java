import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    private double tarifaTransacao;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        super.saldo -= 0.1;
       // while (getNumeracao() == getNumeracao()) {
       //     tarifaTransacao = quantidadeTransacoes * 0.1;
       // }
       // saldo = getSaldo() + valor - tarifaTransacao;
    }


    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        super.saldo -= 0.1;

       // while (getNumeracao() == getNumeracao()) {
       //     tarifaTransacao = quantidadeTransacoes * 0.1;
       // }
       // saldo = getSaldo() - valor - tarifaTransacao;

    }

    public double getTarifaTransacao() {
        return tarifaTransacao;
    }
}
