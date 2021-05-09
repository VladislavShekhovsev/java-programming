package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java"+5+3);
        System.out.println("java"+(5+3));
        System.out.println(5+3+"java");
        System.out.println(5+(3+"java"));
//        java reading from left to wright
//        if math come first java will do math if string with math its gonna be string
//        in parenthesis java will read first( ( (1) 2) 3)
        String str1 = "hello", str2 = "friends";
        System.out.println(str1+" "+str2);
        int num1= 7, num2 = 8;
        System.out.println(num1+" "+num2); // string make concatenation
        System.out.println(num1+num2); // math
        System.out.println(num1+""+num2);
//        System.out.println("java"5+3);-> java53
//        System.out.println(5+3"java");-> 8java
//        " "-> space (also sign)
//        "" -> no sign inside
        char char1= 'a';
        char char2= 'b';
        System.out.println(char1+char2); //When we plus between chars, it will add numbers from ASCII tab.
// calculation * / come first then + and  -


    }
}
