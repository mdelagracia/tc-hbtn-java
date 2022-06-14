import java.text.NumberFormat;
import java.util.Locale;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        Locale localeBR = new Locale("en","US");
        NumberFormat valorFormatado = NumberFormat.getInstance(localeBR);
        valorFormatado.setMaximumFractionDigits(2);
        System.out.println("Valor: R$ " +  valorFormatado.format(valor));
        System.out.printf(Locale.US,"Taxa: %.2f%%%n", taxa);
        }
}

