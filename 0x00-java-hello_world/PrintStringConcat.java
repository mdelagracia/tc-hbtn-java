public class PrintStringConcat {
    public static void main(String[] args) {
        String texto1 = "Holberton";
        String texto2 = "School";
        String espaco = " ";
        String texto3 = texto1.concat(espaco + texto2);
        System.out.printf("Bem vindo a %s!%n", texto3);}
}
