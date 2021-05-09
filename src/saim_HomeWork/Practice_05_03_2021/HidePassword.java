package saim_HomeWork.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        String[] password ={"one","apple","hold"};
        ArrayList<String>hiddenPass=new ArrayList<>();
        for (String each: password){
        hiddenPass.add(convertToStars(each));
        }
        System.out.println("Original: "+ Arrays.toString(password));
        System.out.println("Hidden: "+hiddenPass);
        // helper method, method that do some action, and its called somewhere else
    }
    public static String convertToStars(String str){
        String stars="";
        for (int i = 0; i <str.length() ; i++) {
            stars+="*";

        }
        return stars;
    }
}
