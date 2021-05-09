package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
    MethodOverloading.sum(2,3);
    sum(3,5,70);
    sum(4.7,5.3);
    sum(2,5,10);
    sum("Hello"," world !");
    sum((int)4.2,3);// with casting

    }
    public static void sum (int num1,int num2){
        System.out.println("sum(int num1,int num2)");
        System.out.println("Result = "+(num1+num2));
    }
    public static void sum (int num1,int num2, int num3){// overloading method. same name and different parameters
        System.out.println("sum(int num1,int num2, num3)");
        System.out.println("Result = "+(num1+num2+num3));
    }
    public static void sum(double num1, double num2){// overloading method, same name and different parameters( type of data in value)
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }
    public static void sum(String str1,String str2){
        System.out.println("sum(string, string)");
        System.out.println("Result = " + (str1 + str2));
    }
}
