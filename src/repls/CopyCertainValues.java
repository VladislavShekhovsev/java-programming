package repls;

import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {
       String [] words={"zero", "one", "two","three","four"};
          int count = 0;

      /**    String[]fewValues=new String[count];
        for (String each:words) {
            if(each.contains("e")){
              count ++;

              fewValues[count]+=each;
              i++;
            }
        }
        System.out.println(count);
        System.out.println(fewValues);
       */

        String collection = "";
        for (int i = 0; i <words.length ; i++) {
            int j =0;
            if(words[i].contains("e")){
                count++;
                collection+=words[i]+" ";

            }
        }
        String[]fewValues = new String[count-1];
        System.out.println(Arrays.toString(collection.split(" ")));
       // System.out.println(collection);
       // System.out.println(fewValues.length);
      //  fewValues=collection.split(" ");
      //  System.out.println(Arrays.toString(fewValues));
        fewValues= (collection.split(" "));
        System.out.println(Arrays.toString(fewValues));

    }
}
