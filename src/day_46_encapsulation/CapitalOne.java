package day_46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc =new CheckingAccount();
        acc.setAccountHolder("Vladislav");
        acc.setAccountNumber(1234567);
        acc.setType("Debit");
        acc.setBalance(10_000_000L);
        System.out.println(acc.getAccountHolder());
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getType());
        System.out.println(acc.getBalance());
        System.out.println(acc);
        System.out.println(acc.toString());

    }
}
