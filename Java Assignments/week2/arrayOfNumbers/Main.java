package week2.arrayOfNumbers;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Arrays");
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0;i < 10;i++)
        {
            nums[i] = kb.nextInt();
            if ((nums[i] > 0) && (nums[i] < 100) && (nums[i]%3 == 0)) {
                System.out.println(nums[i]);
            }
        }
    }
}
