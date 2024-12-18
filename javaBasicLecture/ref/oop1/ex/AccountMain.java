package javaBasicLecture.ref.oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(5000);
        //account.withdraw(6000);
        System.out.println("잔고: " + account.balance);
    }
}
