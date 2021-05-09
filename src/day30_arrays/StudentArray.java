package day30_arrays;

import java.sql.SQLOutput;

public class StudentArray {
    public static void main(String[] args){
        String[] student1 = new String[5];
        student1[0]= "AD123457";
        student1[1]="Adam";
        student1[2]= "Smitgh";
        student1[3]= "Batch22";
        student1[4]="443-334-7077";
        String[] student2 ={"Nika","Bloomberg","batch22","443-3347079","ID2222"};
        System.out.println("student 1 id = "+student1[0]);
        System.out.println("student name ="+student1[1]);
        System.out.println("student last name "+student1[2]);
        System.out.println("batch num ="+student1[3]);
        System.out.println("phone number "+student1[4]);
        System.out.println("student name "+student2[0]);
        System.out.println("student last name "+student2[1]);
        System.out.println("batch number "+student2[2]);
        System.out.println("phone number "+student2[3]);
        System.out.println("student id "+student2[4]);
        System.out.println("student data length "+student1.length);
        if(student1.length==5){
            System.out.println("pass, correct length");

        }else{System.out.println("fail, incorrect length");}
        if(student1.length==student2.length){
            System.out.println("pass, data arrays length match");

        }else{
            System.out.println("fail, data arrays length mismatch");
        }
        System.out.println(student1[2]+" "+student1[1].toUpperCase());
        String mobileNumber =student1[4];
        System.out.println(mobileNumber);
        System.out.println(mobileNumber.startsWith("443"));

    }
}
