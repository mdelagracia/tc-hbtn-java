public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;
    @Override
    public double area(){
        return altura * largura;
    }
    public String toString(){

        return ("[Retangulo] " + String.format("%.2f", largura) + " / " + String.format("%.2f", altura)) ;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        } else {
            this.largura = largura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        if (altura < 0) {
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        } else {
            return altura;
        }
    }
}
