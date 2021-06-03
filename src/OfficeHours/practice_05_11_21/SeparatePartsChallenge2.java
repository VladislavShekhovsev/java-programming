package OfficeHours.practice_05_11_21;

import java.util.ArrayList;

public class SeparatePartsChallenge2 {
    public static void main(String[] args) {
        String str="ASDF21345@#$%^";
        ArrayList<Character>all = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            all.add(str.charAt(i));
        }
        ArrayList<Character>letters=new ArrayList<>(all);
        ArrayList<Character>digits=new ArrayList<>(all);
        ArrayList<Character>special=new ArrayList<>(all);
        letters.removeIf(eachChar ->!Character.isLetter(eachChar));
        digits.removeIf(eachChar ->!Character.isDigit(eachChar));
        special.removeIf(eachChar->Character.isLetter(eachChar)||Character.isDigit(eachChar));

        System.out.println("letters "+letters);
        System.out.println("digits "+digits);
        System.out.println("specials "+special);
    }
}
