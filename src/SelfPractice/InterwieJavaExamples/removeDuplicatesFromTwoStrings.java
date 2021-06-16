package SelfPractice.InterwieJavaExamples;

public class removeDuplicatesFromTwoStrings {
    public static void main(String[] args) {
        String a = "aaabbbcccddddddde";
        System.out.println(removeDuplicatesFromTwoStrings.removeDup(a));
    }
    public static String removeDup(String a){
        String b="";
        for (int i = 0; i <a.length() ; i++) {
            if(!b.contains(""+a.charAt(i))){
                b+=a.charAt(i);
            }

        }

    return b;}
}
