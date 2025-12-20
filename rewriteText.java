import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class rewriteText {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            String fileName = "data.txt";

            // ---------- First Write ----------
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            System.out.print("Enter text to write in file: ");
            String firstText = sc.nextLine() + "\n";
            bos.write(firstText.getBytes());
            bos.close();

            // ---------- Read & Display ----------
            FileInputStream fis = new FileInputStream(fileName);

            System.out.println("\nContent of data.txt file BEFORE rewrite:");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();

            // ---------- Rewrite (Overwrite) ----------
            FileOutputStream fos2 = new FileOutputStream(fileName);
            BufferedOutputStream bos2 = new BufferedOutputStream(fos2);

            System.out.print("\n\nEnter text to rewrite in file: ");
            String secondText = sc.nextLine();
            bos2.write(secondText.getBytes());
            bos2.close();

            System.out.println("\nFile rewritten successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
