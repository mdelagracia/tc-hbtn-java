public class PrintStringVariable {
    public static void main(String[] args) {
        String string = "Holberton School";
        String substr = string.substring(0,9);
        System.out.printf("%s%n%s%n%s%n", string, string, substr);}
}
