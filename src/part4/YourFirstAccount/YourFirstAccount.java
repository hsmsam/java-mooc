package part4.YourFirstAccount;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account account = new Account("John", 100);
        account.deposit(20);
        System.out.println(account.balance());
    }
}
