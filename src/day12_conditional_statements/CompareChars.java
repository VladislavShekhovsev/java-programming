package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'B';
                boolean equal = letter1==letter2;
        System.out.println(letter1==letter2);
        System.out.println(letter1>letter2);
        System.out.println(letter1<letter2);
        System.out.println(letter1!=letter2);
        System.out.println(equal);
        char grade = 'A';
        boolean pass = grade <='D';
        System.out.println("Did you passed the exam? "+pass);
    }
}
