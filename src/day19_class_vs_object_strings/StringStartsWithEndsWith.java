package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String [] args){
        String word= "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("inte"));
        System.out.println(word.startsWith("intel"));
        System.out.println(word.startsWith("intell"));
        System.out.println(word.startsWith("intelli"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.startsWith("Int"));//capital=false
        System.out.println(word.endsWith("idea"));
        String name = "Irina";
        if (name.endsWith("a")){
            System.out.println("female name");}
    }
}
