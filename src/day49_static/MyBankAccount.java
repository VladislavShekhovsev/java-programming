package day49_static;

public class MyBankAccount {

        static double balance = 500;
        String user;
        public  void spend(double amount){
         balance-=amount;
            System.out.println(user+"spend $"+amount);
        }

        public void showBalance(){
            System.out.println("balance: "+balance);
        }

    }
