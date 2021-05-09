package day09_scanner_practice;
import java.util.Scanner;
public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println(age+"- that's a great age!");
//        Scanner is non primitive, object type, class type
//        new create neew object from a class
//nextInt() for int value
//nextByte,nextShort,nextLong for whole numbers value
//        nextdouble,nextfloat for decimant,nextBoolean for true or false
//        next() for string, nextLine() for line (many words)

    }



}
