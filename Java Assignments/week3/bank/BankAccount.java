package week3.bank;

public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double bankBalance;

    public BankAccount(String employeeName, String accountNumber) {
        this.ownerName = employeeName;
        this.accountNumber = accountNumber;
        this.bankBalance = 0;
    }

    public String getName() {
        return ownerName;
    }

    public String getNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return bankBalance;
    }

    public void addMoney(double money) {
        bankBalance += money;
    }

    public double calculateInterest() {
        double interest = bankBalance * 0.03;
        return interest;
    }
}
