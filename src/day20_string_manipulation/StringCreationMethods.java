package day20_string_manipulation;
// below import statement is automatically added to each class by compiler
import java.lang.*;//import all classes from java.lang package
import  java.util.*;
public class StringCreationMethods {
    public static void main(String [] args){
        //type 1 and 2 two main methods by they are stored in different places, its connected to memory.
        String word = "potato";// type1
        String word2 =new String ("tomato");//type2
        String word3="";
        String word4 = new String();
        System.out.println(word+" "+word2+""+word3+word4);
        System.out.println("potato");
    }
}
