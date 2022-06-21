public class Numeros0a99 {
    public int numero;

    public static void main(String[] args) {
        for (int numero = 0; numero <= 99; numero++) {
            if (numero < 99) {
                System.out.print(numero + ", ");
            } else {
                System.out.println(numero);
            }
        }
    }
}
