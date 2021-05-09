package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /** 1) word.substring(startIndex, endIndex)
         */
        System.out.println(word.substring(0,3));
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
      // also u can just input the first number and it will go till the end
        //ex
        System.out.println(word.substring(8,11));
        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
        //------------------------------------------------

    }
}
