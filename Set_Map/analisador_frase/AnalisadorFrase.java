import java.util.*;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        // lower case e caracters especias - replace all
        frase = frase.toLowerCase();
        String fraseNova = frase.replaceAll("[\\.?!]", " ");
        String[] palavras = fraseNova.split(" ");
        TreeMap<String, Integer> contagem = new TreeMap<>();
        for (String palavra : palavras) {
            if (palavra != " " && palavra != null && palavra != "") {
                int frequencia = Collections.frequency(List.of(palavras), palavra);
                contagem.put(palavra, frequencia);
            }
        }


        return contagem;
    }
}
