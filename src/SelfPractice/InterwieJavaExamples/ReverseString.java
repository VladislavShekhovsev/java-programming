package SelfPractice.InterwieJavaExamples;

public class ReverseString {
    public static void main(String[] args) {
        String a = "abcdef";
        System.out.println(ReverseString.reverse(a));
    }
    public static String reverse(String a){
        String b="";
        for (int i = a.length()-1; i >=0 ; i--) {
            b+=""+a.charAt(i);
        }
    return b;}
}
