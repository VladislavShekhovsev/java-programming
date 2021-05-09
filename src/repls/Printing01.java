package repls;

public class Printing01 {
    public static void main(String[] args) {
        String[] arr = {"hello", "how", "are", "you", "doing"};
        for (String each : arr) {
            if(each.length()>=3){
            System.out.println(each.substring(0,3));}else{
                System.out.println(each);
            }
        }
        }

        }
