package day47_constructors;

public class Student {
    // no args constructor
   public Student(){
       System.out.println("no args constructor");
   }
   public Student(String name){
       System.out.println("student name: "+name);
   }
   // constructor age
    public Student(int age){
        System.out.println("student age: "+age);
    }
    public Student(String name, int age){
        System.out.println("Student name: "+name+", student age: "+age);
    }

}
