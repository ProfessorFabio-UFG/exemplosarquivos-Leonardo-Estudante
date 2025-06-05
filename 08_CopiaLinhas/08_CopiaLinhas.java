import java.io.*;

public class CopiaLinhas {
    public static void main(String[] args) throws IOException {
        FileReader inputFile = new FileReader("entrada.txt");
        FileWriter outputFile = new FileWriter("saida.txt");

        BufferedReader in = new BufferedReader(inputFile);
        PrintWriter out = new PrintWriter(outputFile);

        String s;
        while ((s = in.readLine()) != null) {
            out.println(s);
            out.flush();
        }

        in.close();
        out.close();
    }
}