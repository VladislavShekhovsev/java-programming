package SelfPractice.InterwieJavaExamples;

public class findUniqueCharacters {
    public static void main(String[] args) {
        String a ="AAABBBCCCDEF";
        System.out.println(findUniqueCharacters.findUnique(a));
    }
    public static String findUnique(String a){
        String b="";

        for (int i = 0; i <a.length() ; i++) {
          int count=0;
            for (int j = 0; j <a.length(); j++) {
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                b+=""+a.charAt(i);
            }
        }


    return  b;}
}
