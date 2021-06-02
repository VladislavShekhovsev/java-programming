package day49_static;

public class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user ="Husband";
        husband.showBalance();
        husband.spend(100);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.showBalance();
        // static belong to class and saved in young generation in heap
        // if u change static it change for all objects of the class
    }
}
