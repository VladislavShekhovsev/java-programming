package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main (String[] args) {
        int i= 1;
        System.out.println("i = "+i);
        i++;
        System.out.println("i = "+i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = "+i);
        int LinesOfCode = 15;
        System.out.println("Lines of code "+LinesOfCode);
        LinesOfCode = LinesOfCode+1;
        LinesOfCode+=1;
        LinesOfCode++;
        ++LinesOfCode;
        System.out.println("Lines of code "+LinesOfCode);
/** 4 different way of decreasin**/
       LinesOfCode=LinesOfCode-1;
       LinesOfCode-=1;
       LinesOfCode--;
       --LinesOfCode;
        System.out.println("Lines of code "+LinesOfCode);
        char letter= 'a';
        System.out.println("letter = "+letter);
        letter++;
        System.out.println("letter = "+letter);
        letter++;
        System.out.println("letter = "+letter);
        letter--;letter--;
        System.out.println("letter = "+letter);


    }
}
