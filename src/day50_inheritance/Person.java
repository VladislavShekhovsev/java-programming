package day50_inheritance;

public class Person {

    //super class/parent class
    String name;
    int age;
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void talk(){
        System.out.println(name+" is talking");
    }
    public void work (String job){
        System.out.println(name+" is working as "+job);
    }
}
