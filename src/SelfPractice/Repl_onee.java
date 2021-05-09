package SelfPractice;

public class Repl_onee {
    public static void main(String[] args) {
        String name = "valefsdfsdfsfddk";
        System.out.println(name.charAt(name.length()-1));
        // (string.charAt(string.length()-1)) to paste always the last character.
        //------------------------------------------------------------------------
        // to make charAt to string just add ""+ at the beginning, ex below.
        //String word = Norka;
      //  System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0))
        String word = "chlen";
        String a=(word.substring(word.length()/2));
      //  System.out.println(a);
        word= word.replace(a,"");
        System.out.println(word);
        /**  String h= (word.substring(word.length()/2));
         word = word.replace(h,"");
         System.out.println(word+word);
         to print only the first half of the string twice.*/
        String word33 = "avvvv";


        word33=(word33.replace("v",""));
        System.out.println(word33);



    }
}
