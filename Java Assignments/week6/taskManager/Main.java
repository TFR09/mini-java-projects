package week6.taskManager;

import java.util.Scanner;

class Main {
    public static int getOption() {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please choose an option");
        System.out.println("1: add a tasks");
        System.out.println("2: Remove a task from one of the lists");
        System.out.println("3: Change Priority");
        System.out.println("4: Promote a task");
        System.out.println("5: Display the lists");
        System.out.println("0: Stop");
        
        System.out.println("Enter an option");
        int option = scan.nextInt();
        return option;
    }

    public static void main(String[] args) {
        ListsManager lm = new ListsManager();
        Scanner kb = new Scanner(System.in);
        int option = getOption();
        
        while (option != 0) {
            switch (option){
                case 0:
                    break;
                case 1:
                    System.out.println("Enter Task: ");
                    lm.addTask(kb.next());
                    break;
                case 2:
                    System.out.println("High Priority Task or Low?");
                    String priority = kb.next();
                    if (priority.equalsIgnoreCase("high")) {
                        System.out.println("Enter Index: ");
                        lm.removeHighPriorityTask(kb.nextInt());
                    }
                    else {
                        System.out.println("Enter Index: ");
                        lm.removeLowPriorityTask(kb.nextInt());
                    }
                    break;
                case 3:
                    System.out.println("Is the Task Important? (Yes/No)");
                    String ans = kb.next();
                    boolean important = (ans.equalsIgnoreCase("yes"))? true:false;
                    System.out.println("Enter Index: ");
                    int index = kb.nextInt();
                    lm.changePriority(important, index);
                    break;
                case 4:
                    System.out.println("Enter Index: ");
                    lm.promote(kb.nextInt());
                    break;
                case 5:
                    System.out.println(lm.toString());
                    break;
                default:
                    break;     
            } 
            option = getOption();
        }  
    }
}
