package saim_HomeWork;

public class OperatorAnalyze {
    public static void main(String[] args) {
        int a = 5;
        int b= a++ + a-- +a*2+a + ++a;
        //     5     6    5*2+%   6 (pre)
        //  post increment after the operation there gonna be calculation
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        //reminder: (X=number),(++X= add one to number before count its pre)
        // (X++ add one one the next X variable its post)
        // (same with --X,X-- pre its before count and post its after count)
    }
}
