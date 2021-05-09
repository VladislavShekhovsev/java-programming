package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean ifSpeeding = currentSpeed==speedLimit;
        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(ifSpeeding);
        double accountBalance = 250.75;
        double itemPrice = 120.0;
        System.out.println("can i afford to buy item:  "+(accountBalance>=itemPrice));
        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("can afford = "+canAfford);
        accountBalance-=itemPrice;
        System.out.println(accountBalance);
        boolean isBroke =  accountBalance <= 0;





    }
}
