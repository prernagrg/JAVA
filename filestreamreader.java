import java.io.*;

public class filestreamreader {
    public static void main(String[] args) {
        try {
            File file = new File("java.txt");
            FileInputStream filereader = new FileInputStream(file);
            int character;
            while ((character = filereader.read()) != -1) {
                System.out.print((char) character);
            }
            filereader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}