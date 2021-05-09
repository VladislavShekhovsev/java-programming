package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for(int n=1;n<=100;n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("odd");


    }
}
