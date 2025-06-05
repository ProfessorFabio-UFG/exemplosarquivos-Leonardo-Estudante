import java.io.*;

public class LeituraArquivo {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\listaAlunos.txt");

        FileInputStream in = new FileInputStream(arquivo);
        InputStreamReader conversor = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(conversor);

        String linha;
        while ((linha = bf.readLine()) != null) {
            System.out.println(linha);
        }

        bf.close();
        in.close();
    }
}