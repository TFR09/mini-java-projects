package week1.parcel;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Parcels to USA");
        Scanner scan = new Scanner(System.in);
        int width, height, length;
        System.out.println("Please enter width");
        width = scan.nextInt();
        System.out.println("Please enter height");
        height = scan.nextInt();
        System.out.println("Please enter length");
        length = scan.nextInt();

        if (((width + length + height) > 90) || (width > 60) || (height > 60) || (length > 60)) {
            System.out.println("parcel cannot be sent");
        }
        else {
            System.out.println("parcel can be sent");
        }
        
    }
}