package day50_inheritance;

public class Student extends Person {
    String school;
    String studentId;
    int grade;
    boolean isActive;
    public void study(){
        System.out.println(name+" is study in "+school);
    }

}
