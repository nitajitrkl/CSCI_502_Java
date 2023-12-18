public class BankAccount {
//    public BankAccount (int anAccountNumber) {
//        accountNumber = anAccountNumber;
//        balance = 0;
//    }
    public BankAccount (int anAccountNumber, double initialBalance) {
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount) {
        balance -= amount;
    }
    public double getBalance () {
        return balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    private double balance;
    private int accountNumber;

    public void falseSwap(BankAccount a, BankAccount b)
    {
        BankAccount temp = a;
        a = b;
        b = temp;
    }
}


