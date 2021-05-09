package repls;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {
        String [] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String longestWord ="";
        for (String each: words) {
         if(each.length()>longestWord.length()){
           longestWord=each;
         }
        }
        System.out.println(longestWord);
    }
}
