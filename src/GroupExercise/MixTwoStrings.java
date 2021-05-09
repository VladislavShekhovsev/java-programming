package GroupExercise;

public class MixTwoStrings {
    public static void main(String[] args) {

        String a = "java";
        String b = "isisad";

        System.out.println(addingStrings(a, b));
        System.out.println(addingStrings("lera","1234"));

    }

    public static String addingStrings(String a, String b) {
        String result = "";
        for (int i = 0, j = 0, k = 0; i < a.length() + b.length(); i++) {
            if (j < a.length()) {
                result += a.charAt(j++);
            }
            if (k < b.length()) {
                result += b.charAt(k++);
            }
            if (j == a.length() && k == b.length()) {
                break;
            }
        }
        return result;
    }
}
           //another method
      /**   public static void mergeStrings(String a, String b) {
         String mergedStrings = "";
         if (a.length() <= b.length()) {
         for (int i = 0; i < a.length(); i++) {
         mergedStrings += "" + a.charAt(i) + b.charAt(i);
         }
         mergedStrings += b.substring(a.length());
         } else {
         for (int i = 0; i < b.length(); i++) {
         mergedStrings +="" + a.charAt(i) + b.charAt(i);
         }
         mergedStrings += a.substring(b.length());
         }
         System.out.println(mergedStrings);

         }
         }
         */

