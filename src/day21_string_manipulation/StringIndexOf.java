package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word ="github";
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("hub")); // return only first character;
        System.out.println(word.indexOf("noch"));// will return -1, -1 its sign that he didnt found the match
    }
}
