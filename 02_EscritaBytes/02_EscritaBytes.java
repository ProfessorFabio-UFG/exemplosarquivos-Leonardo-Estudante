import java.io.*;

public class EscritaBytes {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("C:\\tmp");
        diretorio.mkdir();

        File arquivo = new File(diretorio, "lixo.txt");
        FileOutputStream out = new FileOutputStream(arquivo);

        out.write(new byte[]{'l', 'i', 'x', 'o'});

        File subdir = new File(diretorio, "subdir");
        subdir.mkdir();

        String[] arquivos = diretorio.list();
        for (String nome : arquivos) {
            File filho = new File(diretorio, nome);
            System.out.println(filho.getAbsolutePath());
        }

        if (arquivo.exists()) {
            arquivo.delete();
        }

        out.close();
    }
}