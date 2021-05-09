package repls;

public class PrintFirstAndLastCharacterFromArray {
    public static void main(String[] args) {
       String [] words = {"hello", "why", "by", "apple" , "note"};
        for( String each : words){
            System.out.println(each.substring(0,1)+each.substring(each.length()-1));

        }


    }
}
