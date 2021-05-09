package repls;

import java.util.Scanner;

public class MethodsNext3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int num){
        System.out.println("next 3 are:");
        for (int i = 0; i <3 ; i++) {
            System.out.print(++num+" ");
        }
    }
}
