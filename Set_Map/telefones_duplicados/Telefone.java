import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.numero = numero;
        this.codigoArea = codigoArea;
    }


    public String toString() {
        return String.format("(%s) %s", this.codigoArea, this.numero);
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 != null && this.getClass() == var1.getClass()) {
            Telefone var2 = (Telefone)var1;
            return this.codigoArea.equals(var2.codigoArea) && this.numero.equals(var2.numero);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }


}
