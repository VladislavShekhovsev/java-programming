package repls;
import java.util.*;
public class FindTheShortest2 {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] strArr = str.split(", ");

        int count = strArr[0].length();
        String outcome = "";
        for (int i = 0; i < strArr.length; i++) {
            if (count == strArr[i].length()) {
                outcome += " " + strArr[i];
            } else if (count > strArr[i].length()) {
                outcome = strArr[i];
                count = strArr[i].length();
            }

        }
        String[] outArr = outcome.trim().split(" ");
        Arrays.sort(outArr);
        System.out.println(Arrays.toString(outArr));
    }
}


