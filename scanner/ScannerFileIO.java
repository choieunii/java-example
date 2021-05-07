package scanner;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerFileIO {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
            PrintWriter pw = new PrintWriter("copy.txt");
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                pw.println(name);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("Exception occurred!");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
