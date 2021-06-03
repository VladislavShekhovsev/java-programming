package OfficeHours.practice_05_12_21;

public class Bank {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount();
        accountOne.accountHolderNAme="James Bond";
        accountOne.pin = 1234;
        accountOne.balance =1_000_000;
        accountOne.accountNumber=2134565456787L;
        System.out.println(accountOne.pin);
        System.out.println(accountOne.getBalance(1234));
    }
}
