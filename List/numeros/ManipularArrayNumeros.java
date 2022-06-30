import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {

        if (!numeros.contains(numero)) {
            return -1;
        }
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) {
        if (buscarPosicaoNumero(numeros, numero) != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        } else {
            numeros.add(numero);
        }
    }

    public static void removerNumero(List<Integer> numeros, int numero) {
        int posicao = 0;
       posicao = buscarPosicaoNumero(numeros, numero) ;
        if (posicao == -1) {
            throw new RuntimeException("Numero nao encontrado na lista");
       } else {
           numeros.remove(posicao);
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int posicao = 0;
        posicao = buscarPosicaoNumero(numeros ,numeroSubstituir);
        if (buscarPosicaoNumero(numeros, numeroSubstituir) == -1) {
            numeros.add(numeroSubstituto);
        } else {
            numeros.set(posicao, numeroSubstituto);
        }
    }
}
