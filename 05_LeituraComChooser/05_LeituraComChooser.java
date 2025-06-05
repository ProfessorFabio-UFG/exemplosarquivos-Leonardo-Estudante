import javax.swing.*;
import java.io.*;

public class LeituraComChooser {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.CANCEL_OPTION) {
            System.exit(0);
        } else {
            File farqEnt = fc.getSelectedFile();
            try {
                FileReader f = new FileReader(farqEnt);
                BufferedReader in = new BufferedReader(f);

                String linha;
                while ((linha = in.readLine()) != null) {
                    System.out.println(linha);
                }

                in.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}