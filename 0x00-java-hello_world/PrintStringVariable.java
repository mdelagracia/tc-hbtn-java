public class PrintStringVariable {
    public static void main(String[] args) {
        String texto = "Holberton School";
        String substr = texto.substring(0,9);
        System.out.printf("%s%n%s%n%s%n", texto, texto, substr);}
}
