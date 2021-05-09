package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "phyton";
        if (todayClass.equals("java"))
            System.out.println("java is fun");
        System.out.println("second statement for check");
        // without { }in if only 1 first  print attached.
        // but noe encouraged
        int a = 2;
        if (a == 1)
            System.out.println("a=1");
        System.out.println("1=a");
        // without {} the second will run because second
        // is not belong to if statement. without {} it catch only first statement
    }
}