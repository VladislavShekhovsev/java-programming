package day45_oops;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 ="java";// in String pool
        String word2 = "java";// reuse from string pool
        String word3 =new String("java");// create in heap, outside String pool
        System.out.println(word1==word2);// true
        System.out.println(word1==word3);// false
        String word4 =new String("java");// new object in heap memory
        System.out.println(word3==word4);// also gonna be false because
        // this are 2 different objects with different location
        System.out.println(word1.equals(word2));//true,because .equals check the value itself not the location
        System.out.println(word1.equals(word3));//true,because .equals check the value itself not the location
        System.out.println(word3.equals(word4));//ture,because .equals check the value itself not the location
        //System.gc(); just method to call garbage collector to remove unused objects
    }
}
