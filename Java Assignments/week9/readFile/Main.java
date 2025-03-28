package week9.readFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cScan = new Scanner(System.in);
        System.out.print("Input file ? ");
        String inFile = cScan.nextLine();
        FileInputStream fileInput = new FileInputStream(inFile);
  
        Scanner fScan = new Scanner(fileInput);
		    System.out.print("String to search for ? ");
        String findStr = cScan.nextLine();
        while (fScan.hasNextLine()) {
            String line = fScan.nextLine();
            if (line.contains(findStr)){
                System.out.println(line);    
            }
        }
    }
}