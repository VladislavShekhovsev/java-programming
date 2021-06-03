package OfficeHours;
import  java.util.*;
public class SmallestAndLongestWordFromArray {
    // het dinamic value from user and store it in array words
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter");
        String[] words = new String[input.nextInt()];
        System.out.println(Arrays.toString(words));
        input.nextLine();
        for(int i =0;i< words.length;i++){
            System.out.println("Enter word: "+(i+1));// just for msg to start from one not from 0 (i starts from 0)
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));
       // String smallest, largest;
        String [] smallAndLarge = {words[0],words[0]};//0 will hold the smallest value and 1 will hold the largest
        for(String eachWord:words){
            if(eachWord.length()<smallAndLarge[0].length()){
                smallAndLarge[0]=eachWord;
            }
            if(eachWord.length()>smallAndLarge[1].length()){
                smallAndLarge[1]=eachWord;
            }
        }
        System.out.println("Smallest element: "+smallAndLarge[0]);
        System.out.println("My largest element: "+smallAndLarge[1]);



    }
}
