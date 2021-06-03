package OfficeHours.practice_05_12_21;

public class BankAccount {

        String accountHolderNAme;
        int pin;
        double balance;
        long accountNumber;
        public double getBalance(int inputPin){
            if (pin==inputPin){
                return balance;
            }
                return -1;
        }

}
