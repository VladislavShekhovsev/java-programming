package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance= 1230.55;
        System.out.println("balance; "+balance);
        double baklava = 22.50;
        balance = balance-baklava;
        System.out.println("our new balance after buying baklava is :"+balance);
        double kenafa= 44.45;
        System.out.println("kenafa; "+kenafa);
        balance=balance-kenafa;
        System.out.println("our new balance after buying kenafa is: "+balance);
        balance = balance-(kenafa/2);
        System.out.println("our new balance after buying discounted benafa is: "+balance);
        double plov= 7.99;
                balance = balance-plov;
        System.out.println("our new balance after buying plov is: "+balance);
        double icedTea = 3.0;
        balance = balance-(icedTea*4);
        System.out.println("our new balance after buying 4 iced tea is: "+balance);
        balance= balance + baklava;
        System.out.println("our new balance after returning baklava is: "+balance);

//shorthand assignment operators;
//        in java or any other programming we use variables a lot,
//        and we need to update the same variable value often.
        int n =5;
        int b= 3;
        n = n+ b;
        System.out.println("n = "+n);
        n+= 3;
        System.out.println("our new n = "+n);




    }
}
