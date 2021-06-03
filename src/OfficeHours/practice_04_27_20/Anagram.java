package OfficeHours.practice_04_27_20;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silence","license"));
        System.out.println(isArmstrong(153));

    }
    //toCharArray->sort->equal?
    // loop through one string-> remove the char that u iterate through
    // in the other String ->if empty the 2nd is empty
    public static boolean isAnagram(String one,String two){
     if(one.length()!=two.length()){
         return false;
     }
     one=one.toLowerCase();
     two=two.toLowerCase();

     int [] count =new int[26];
        for (int i = 0; i <one.length() ; i++) {
         char letterFromOne = one.charAt(i);// A= ascii value 97
         char letterFromTwo =two.charAt(i);
         count[ letterFromOne-97]= count[letterFromOne-97]+1;
         count[ letterFromTwo-97]= count[letterFromTwo-97]-1;
        }
        return Arrays.equals(count,new int[26]);
    }
    public static boolean isArmstrong(int num){
        String strNum =""+num;
        int power =strNum.length();
        int sum=0;

        for(int i =0; i<strNum.length(); i++){
            int eachDigit = Integer.parseInt(strNum.substring(i,i+1));
            sum+=Math.pow(eachDigit,power);// very useful method ^ in power
        }
        return  num==sum;
    }
}
