import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void serializar(List<T> estudantes) throws IOException {
        File arq = new File(nomeArquivo);
        try {
            arq.delete();
            arq.createNewFile();
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(estudantes);
            objOutput.close();
        } catch (IOException erro) {
            throw new IOException("Nao foi possivel serializar");
        }
    }

    public List<T> desserializar() throws Exception {
        List<T> lista = null;
        try {
            File arq = new File(nomeArquivo);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (List<T>) objInput.readObject();
                objInput.close();
            }else{
                System.out.println("Nao foi possivel desserializar");
            }
        } catch (IOException erro) {
            throw new IOException("Nao foi possivel desserializar");
        }
        return lista;
    }
}
