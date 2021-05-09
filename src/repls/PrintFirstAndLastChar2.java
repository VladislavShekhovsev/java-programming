package repls;

import java.util.Arrays;

public class PrintFirstAndLastChar2 {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple", "note"};
        String[] newWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3) {
                   newWords[i] = words[i].substring(0,1)+words[i].substring(words[i].length()-1);}
              else{newWords[i] = words[i];}
            }
            System.out.println(Arrays.toString(newWords));
        }
    }
