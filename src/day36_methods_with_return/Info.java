package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name: "+fullName());
        System.out.println("Status: Married = "+isMarried());
        System.out.println("Age: "+getAGe());
        System.out.println(getRandomYear());// dynamic. different year each time.
        String name =fullName();
        boolean married = isMarried();
        int age =getAGe();
        int year =getRandomYear();
        System.out.println("name:"+name);
        System.out.println("if married? "+married);
        System.out.println(" age are "+age);
        System.out.println("year "+year);
        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }
    }
    public static String fullName(){
        System.out.println("inside full name method");
        return "Vladislav Shekhovsev";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAGe(){
        int age =32;
        return age;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
