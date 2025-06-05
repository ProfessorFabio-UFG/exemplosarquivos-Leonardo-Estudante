import javax.swing.*;
import java.io.*;

public class EscritaArquivo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("arquivo.txt");
        PrintWriter pw = new PrintWriter(fw);

        String linha = JOptionPane.showInputDialog("Digite uma linha (fim para encerrar):");
        while (!linha.equalsIgnoreCase("fim")) {
            pw.println(linha);
            pw.flush();
            linha = JOptionPane.showInputDialog("Digite uma linha (fim para encerrar):");
        }

        pw.close();
    }
}