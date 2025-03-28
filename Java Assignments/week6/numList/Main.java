package week6.numList;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("List of Numbers");
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner kb = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.println("Enter a number: ");
            nums.add(kb.nextInt());
        }

        int num = kb.nextInt();
        
        for (int listnum : nums){
            if (listnum > num){
                System.out.println(listnum);
            }
        }
    }
}
