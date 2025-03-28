package week9.copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream("infile.txt");
        Scanner scan = new Scanner(fileIn);

        PrintWriter fileOut = new PrintWriter("outfile.txt");
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            fileOut.println(line);    
        }

        fileOut.close();
    }
}