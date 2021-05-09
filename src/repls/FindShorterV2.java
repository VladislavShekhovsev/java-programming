package repls;
import java.util.*;
public class FindShorterV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
     String [] words = str.split(", ");
        System.out.println(Arrays.toString(words));
        String min = words[0];
        for (int i = 0;i< words.length;i++) {

            if(min.length()>=words[i].length()){//corent nim =5>3 . next line nim =3
                min=words[i]+" ";
                System.out.print(Arrays.toString(min.split(" ")));
            }


        }
        






    }
}
