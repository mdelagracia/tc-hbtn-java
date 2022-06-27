import exceptions.OperacaoInvalidaException;


public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;
    double taxaJurosMensal = 0;
    double tarifaMensal = saldo * 0.1;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        double saldo = 0;
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        }

        saldo = getSaldo() + valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        if (saldo < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo = getSaldo() - valor;
    }

    public double calcularTarifaMensal() {
        double tarifaMensal = saldo * 0.1;
        if (tarifaMensal > 10) {
            return 10;
        }
        return tarifaMensal;
    }

    public double calcularJurosMensal() {
        taxaJurosMensal = taxaJurosAnual / 12;
        if (saldo < 0) {
            taxaJurosMensal = 0;
        }
        return taxaJurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        saldo += (getSaldo() * (calcularJurosMensal()/100)) - calcularTarifaMensal();
    }
}
