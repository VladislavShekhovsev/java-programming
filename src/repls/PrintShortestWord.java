package repls;

public class PrintShortestWord {
    public static void main(String[] args) {
       String [] word= {"java", "cable", "red", "vivid", "remedy", "grace"};
       String str = word[0];
        for (int i =0;i<word.length;i++){
            if (word[i].length()<str.length()){
                str =word[i];
            }
        }
        System.out.println(str);
        }
    }

