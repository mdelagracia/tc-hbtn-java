public class Empregado {

    public double salarioFixo;
    public double bonus;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            bonus = salarioFixo * 0.1;
        }
        return bonus;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return getSalarioFixo() + calcularBonus(departamento);
    }
}
