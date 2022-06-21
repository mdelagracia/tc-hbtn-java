public class NumerosPares {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 99; numero = numero + 2) {
            if (numero < 98) {
                System.out.print(numero + ", ");
            } else {
                System.out.println(numero);
            }
        }
    }
}
