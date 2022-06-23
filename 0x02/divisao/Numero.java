public class Numero {


 

    public static void dividir(int a, int b) {

        int c = 0;
        try {
            if (b == 0) {

                throw new Exception("Nao eh possivel dividir por zero");

            }
            c = a / b;

        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());

        } finally {
            System.out.println(a + " / " + b + " = " + c);
        }
    }
}
