package SelfPractice;

import java.util.Scanner;
public class LocateCharacterAndReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int end = word.length()-1;
        if (word.substring(0,1).equalsIgnoreCase("x")||word.substring(end).equalsIgnoreCase("x")) {
            if (word.substring(0,1).equalsIgnoreCase("x")){
                System.out.println(word.substring(1));}else{
                System.out.println(word.substring(0,end));
            }
            }
    }
}

