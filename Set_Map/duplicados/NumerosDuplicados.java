import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] busca){
        HashSet<Integer> duplicados = new HashSet<>();
        HashSet<Integer> inteiros = new HashSet<>();

         for(int i=0; i<busca.length; i++){
             if(!inteiros.contains(busca[i])){
                 inteiros.add(busca[i]);
             }else{
                 duplicados.add(busca[i]);
             }
        }

         TreeSet<Integer> numerosDuplicados = new TreeSet<>();
         numerosDuplicados.addAll(duplicados);
         return numerosDuplicados;
    }
}
