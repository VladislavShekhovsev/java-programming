package day32_arrays_split;

import java.util.Locale;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] sentenceToArray = sentence.split(" ");
        String reversed ="";
        for(int i =sentenceToArray.length-1;i>=0;i--){
          //  System.out.println(sentenceToArray[i]);
            reversed+=sentenceToArray[i]+" ";
        }
        System.out.println(reversed.trim());

    }
}
