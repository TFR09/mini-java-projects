package week3.bank;

import java.util.Scanner;

class Main {
  // Find employee and returns salary, -1 if employee not found
    public static double findBalance(BankAccount[] accounts, String number) {
        for (int i = 0, l = accounts.length; i < l; i++) {
        if (number.equalsIgnoreCase(accounts[i].getNumber())) {
            return accounts[i].getBalance();
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        BankAccount accounts[] = new BankAccount[2];
        Scanner kb = new Scanner(System.in);
        for (int i = 0, l = accounts.length; i < l; i++) {
            System.out.println("Enter the name of account owner");
            String owner = kb.next();
            System.out.println("Enter the account number");
            String accountNumber = kb.next();

            accounts[i] = new BankAccount(owner, accountNumber);

            System.out.println("Enter the account balance");
            accounts[i].addMoney(kb.nextDouble());
        }

        System.out.println("Enter the account number to be found");
        String accountNumber = kb.next();
        double balance = findBalance(accounts, accountNumber);

        if (balance == -1) {
            System.out.println("Account not found");
        } else {
            System.out.println(balance);
        }
    }
}

