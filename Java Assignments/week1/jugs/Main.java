package week1.jugs;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Translate the jug problems from Python to Java!");
        int capA, capB, target, volA = 0, volB = 0, transfer;
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter capacity for A");
        capA = kb.nextInt();
        System.out.println("Please enter capacity for B");
        capB = kb.nextInt();
        System.out.println("Please enter target volume");
        target = kb.nextInt();

        while ((volA != target) && (volB != target) && (volA+volB !=  target)){
            if (volA == 0){
                volA = capA;
                System.out.println("Fill jug A with "+ volA + " litres");
            }
            else if (volB == capB){
                System.out.println("Empty jug B");
                volB = 0;
            }  
            else {
                System.out.println("Transfer water from jug A to jug B");
                if (volA < capB-volB) {
                    transfer = volA;
                    volA=0;
                    volB += transfer; 
                }
                else {
                    transfer = (capB - volB);
                    volA-= transfer;
                    volB = capB;
                } 
            }
            
            System.out.println(volA+" litres in jug A and " + volB +" litres in jug B");
        }
        if (volA == target) {
            System.out.println("Jug A contains the desired quantity of water");
        }
        else if (volB == target) {
            System.out.println("Jug B contains the desired quantity of water");
        }
        else {
            System.out.println("Jug A + Jug B contains the desired quantity of water");
        }
    }
}