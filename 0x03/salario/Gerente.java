public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            bonus = salarioFixo * 0.2 + (departamento.valorAtingidoMeta % departamento.valorMeta * 0.01);
        }
        return bonus;

    }
}
