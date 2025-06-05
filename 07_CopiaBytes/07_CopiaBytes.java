import java.io.*;

public class CopiaBytes {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("entrada.doc");
        File outputFile = new File("saida.doc");

        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}