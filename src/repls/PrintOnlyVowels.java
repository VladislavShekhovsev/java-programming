package repls;

public class PrintOnlyVowels {
    public static void main(String[] args) {
        String str = "howdyho";

        for(int i = 0;i<=str.length()-1;i++){
            if(str.substring(i,i+1).equals("a")||
                    str.substring(i,i+1).equals("e")||
                    str.substring(i,i+1).equals("i")||
                    str.substring(i,i+1).equals("o")||
                    str.substring(i,i+1).equals("u")){
                System.out.print(str.charAt(i));
            }
        }

    }
}
