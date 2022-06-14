import java.text.NumberFormat;
import java.util.Locale;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(localeBR);
        System.out.println(valorFormatado.format(valor));
        System.out.printf(Locale.US,"%.2f%%%n", taxa);
    }
}
