package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String world = "Anna";
        System.out.print(world.charAt(3));
        System.out.print(world.charAt(2));
        System.out.print(world.charAt(1));
        System.out.println(world.charAt(0));
        System.out.println(""+world.charAt(3)+world.charAt(2)+world.charAt(1)+world.charAt(0));
        String word2 = ""+world.charAt(3)+world.charAt(2)+world.charAt(1)+world.charAt(0);
        System.out.println("word "+world);
        System.out.println("word2 "+word2);
        if(world.equalsIgnoreCase(word2)){
            System.out.println("palindrome word");
        }else{
        System.out.println("not palindrome word");}
    }
}
