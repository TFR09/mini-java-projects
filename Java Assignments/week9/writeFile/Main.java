package week9.writeFile;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");
        writeToFile("numbers.txt");
        System.out.println(getAverage("numbers.txt"));
    }
    
    static void  writeToFile(String filename) throws FileNotFoundException {
        Random r = new Random();
        PrintWriter fileOut = new PrintWriter(filename);
        for (int num,i = 0; i < 300; i++)
        {
            num = r.nextInt(101);
            fileOut.println(num);
        }
        fileOut.close();
    }

    static double getAverage(String filename) throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename);
        Scanner scan = new Scanner(fileIn);
        double nums = 0, average = 0;
        while (scan.hasNextInt()){
        average += scan.nextInt();
        nums++;
        }
        average /= nums;
        return average;
    }
} 