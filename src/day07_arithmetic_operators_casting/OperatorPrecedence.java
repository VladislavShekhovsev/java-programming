package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10+5);//15
        System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2
        System.out.println(2*3);//6
        System.out.println(2*3/3);//2
        System.out.println(20/(2*2));//5
//        System.out.println(10/0);->cannot divide by ZERO.ERROR while code is running
        System.out.println(2+5*3);//17
        System.out.println((2+5)*3);//21
//        In Java, if you try divide any number by zero, error will happen during the run time
//        but u can divide zero by any number
//        System.out.println(num/0) //ERROR/Exception during runtime.
        System.out.println(10/3);//Java will show 2 and  throw away the remainder 0.333 (wipe it)
        System.out.println(5/2);
//        WHEN you divide whole numbers
//        if u need mathematical precision, NEVER divide integers/whole numbers
//        use decimal points number double or float ex:
//        System.out.println(5.0/2.0)= 2.5 or System.out.println(10.0/3.0)=3.333
        System.out.println(10.0/3.0);
        System.out.println(10.00/4.00);

    }
}
