import java.util.Locale;
public class PrintFloatVariable {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        float pi = (float) 3.14159;
        System.out.printf("Valor de pi: %.3f%n",pi);}}
