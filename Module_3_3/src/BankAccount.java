public class BankAccount {
    private static int totalAccounts = 0;
    private int accountNumber;
    private int balance;
    public BankAccount(int balance){
        totalAccounts++;
        this.accountNumber = totalAccounts;
        this.balance = balance;
    }
    public void deposit(int deposit){
        this.balance += deposit;
    }

    public void withdraw(int withdraw) {
        if (withdraw<=this.balance) {
            this.balance -= withdraw;
        } else {
            this.balance = 0;
        }
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    static int getTotalAccounts(){
        return totalAccounts;
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}


