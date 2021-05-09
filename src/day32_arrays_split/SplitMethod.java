package day32_arrays_split;
import java.sql.SQLOutput;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        // index        0       1     2         2
        String words= "java. python. selenium.  html";
        String [] wordsArray = words.split(". ");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of Array is: "+wordsArray.length);
        String sentence ="today i am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        for(String each: sentenceArray){
            System.out.println(each);
        }
        System.out.println("first word: "+sentenceArray[0]);
        System.out.println("first word: "+sentence.split(" ")[0]);
        System.out.println("number of word in sentence = "+sentenceArray.length);

        for(String each :sentenceArray ){
            System.out.println(each);
        }

    }
}
