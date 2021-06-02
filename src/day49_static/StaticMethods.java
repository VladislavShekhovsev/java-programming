package day49_static;

public class StaticMethods {

    int  num =10;// need static key word for static method,otherwise we cant use them
    static int count = 5;
    public static void displayMessage(String message){
        System.out.println("message "+message);
       // System.out.println("num = "+num);ERROR: num is instance variable. static method cannot access.
        System.out.println("count ="+count);//works, because  its static variable

    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");// static can call other static
    }
    //StaticMethods.instanceMethod = would not work, need object
    public void instanceMethod(){// need object
        // nut he have access to all variables in the class
        System.out.println("instanceMethod");
        System.out.println("num = "+num);
        System.out.println("count = "+count);

    }
}
