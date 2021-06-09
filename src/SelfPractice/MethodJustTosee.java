package SelfPractice;

public class MethodJustTosee {
    public static void main(String[] args) {
        String name = "AVladY";

        substring1(name);
        System.out.println(substring1(name));

    }
    public static String substring1(String word){
      word = word.substring(1,word.length()-1);
    return word;}
}
