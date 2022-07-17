import java.io.*;
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

    public List<T> desserializar() throws IOException {
        List<T> lista = new ArrayList<>();
        try {
            File arq = new File(nomeArquivo);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                lista = (List<T>) objInput.readObject();
                objInput.close();
            }
        } catch (IOException erro1) {
            throw new IOException("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
