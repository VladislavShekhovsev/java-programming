package repls;

public class PrintUniqueWords {
    public static void main(String[] args) {
     String str ="12 24 12 ";
     String[] newWord =  str.split(" ");
        isUnique(newWord);
    }
    public static void isUnique(String []words){
        for (int i = 0; i < words.length ; i++) {
         int count =0;
            for (String each: words)
                if(each.equals(words[i])){
                    count++;
                }
                if(count==1){
                    System.out.print(words[i]);
                }


        }

 }
}
