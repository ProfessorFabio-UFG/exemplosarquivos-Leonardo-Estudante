import java.io.*;

public class EscritaTeclado {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o texto (termine com Enter):");

        FileOutputStream f0 = new FileOutputStream("C:\\saida0.txt");

        byte a = (byte) System.in.read();
        while (a != '\n') {
            f0.write(a);
            a = (byte) System.in.read();
        }

        f0.close();
    }
}