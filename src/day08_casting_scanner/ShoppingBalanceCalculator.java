package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance - (price1 + price2 + price3);
        balance= remainingBalance;
        int freshBalance = (int)remainingBalance;
//     double remainingBalance = (balance - price1 -price2 -price3);  same
        System.out.println("Your remaining balance without cents " + freshBalance+ ", your remaining balance " + remainingBalance);

    }
}



